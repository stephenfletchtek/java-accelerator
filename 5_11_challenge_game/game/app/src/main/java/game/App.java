package game;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static App app;
    static ArrayList<Game> games = new ArrayList<Game>();
    static ArrayList<String> players = new ArrayList<String>();
    static Scanner scanner;
   
    public App(WordChooser chooser, Masker masker) {
        games.add(new Game(chooser, masker));
        games.add(new Game(chooser, masker));
        players.add("Player 1");
        players.add("Player 2");
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        app = new App(new WordChooser(), new Masker());

        Integer nextToPlay = (int)(Math.random() * 2);
        System.out.println(app.displayGreeting(nextToPlay));

        while (app.notLostOrWon()) {
            app.guessPrompt(nextToPlay);
            String userInput = scanner.nextLine();
            if (userInput != "") {
                Character myGuess = userInput.charAt(0);
                app.guessLetter(nextToPlay, myGuess);
            }
            nextToPlay = app.setNextToPlay(nextToPlay);
        }
    }

    public String displayGreeting(Integer nextToPlay) {
        String output = "Welcome! Today the word to guess is:\n";
        String player;
        String word;

        for (int i = 0; i < games.size(); i++) {
            player = players.get(nextToPlay);
            word = games.get(nextToPlay).getWordToGuess();
            output = output + player + ": " + word + "\n";
            nextToPlay = setNextToPlay(nextToPlay);
        }
        return output;
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
        String player = players.get(nextToPlay);
        Integer attempts = games.get(nextToPlay).getRemainingAttempts();
        System.out.printf("\n%s: Enter one letter to guess (%d attempts remaining):\n", player, attempts);
    }

    private Boolean notLostOrWon() {
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).isGameLost()) {
                System.out.println("You Lose!");
                return false;
            }
            if (games.get(i).isGameWon()) {
                System.out.println("You Win!");
                return false;
            }
        }
        return true;
    }

    private Integer setNextToPlay(Integer current) {
        if (current == 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
