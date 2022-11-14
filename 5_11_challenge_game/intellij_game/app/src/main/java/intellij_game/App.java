package intellij_game;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    static ArrayList<Game> games = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public App(WordChooser chooser, Masker masker, String[] playerNames) {
        for (String playerName : playerNames) {
            games.add(new Game(chooser, masker, playerName));
        }
    }
    public static void main(String[] args) {
        String[] playerNames = new String[2];
        for (int i = 0; i < 2; i++) {
            System.out.printf("Enter a name for player %d\n", i + 1);
            playerNames[i] = scanner.nextLine();
        }

        App app = new App(new WordChooser(), new Masker(), playerNames);

        Integer nextToPlay = (int)(Math.random() * 2);
        System.out.println(app.displayGreeting(nextToPlay));

        app.gameLoop(app, nextToPlay);
    }

    private void gameLoop(App app, Integer nextToPlay) {
        while(app.notLostOrWon()) {
            app.guessPrompt(nextToPlay);
            String userInput = scanner.nextLine();
            if (!Objects.equals(userInput, "")) {
                Character myGuess = userInput.charAt(0);
                app.guessLetter(nextToPlay, myGuess);
            }
            nextToPlay = app.setNextToPlay(nextToPlay);
        }
    }

    public String displayGreeting(Integer nextToPlay) {
        StringBuilder output = new StringBuilder("Welcome! Today the word to guess is:\n");
        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(nextToPlay);
            output.append(game.getPlayerName())
                    .append(": ")
                    .append(game.getWordToGuess())
                    .append("\n");
            nextToPlay = setNextToPlay(nextToPlay);
        }
        return output.toString();
    }

    private void guessLetter(Integer nextToPlay, Character chr) {
        if (games.get(nextToPlay).guessLetter(chr)) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong...");
        }
        System.out.println(games.get(nextToPlay).getWordToGuess());
    }

    private void guessPrompt(Integer nextToPlay) {
        String player = games.get(nextToPlay).getPlayerName();
        Integer attempts = games.get(nextToPlay).getRemainingAttempts();
        System.out.printf("\n%s: Enter one letter to guess (%d attempts remaining):\n", player, attempts);
    }
    private Boolean notLostOrWon() {
        for (Game game : games) {
            if (game.isGameLost()) {
                System.out.println("You Lose!");
                return false;
            }
            if (game.isGameWon()) {
                System.out.println("You Win!");
                return false;
            }
        }
        return true;
    }
    private Integer setNextToPlay(Integer current) {
        return Math.abs(current -1);
    }
}
