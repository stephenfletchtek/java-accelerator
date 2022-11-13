package game;

import java.util.Scanner;

public class App {
    static App app;
    static Game game;
    static Scanner scanner;

    public App(WordChooser chooser, Masker masker) {
        game = new Game(chooser, masker);
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        app = new App(new WordChooser(), new Masker());

        System.out.println(app.getGreeting());
        System.out.println(game.getWordToGuess());
        
        while (!game.isGameLost() && !game.isGameWon()) {
            app.guessPrompt();
            String userInput = scanner.nextLine();
            if (userInput != "") {
                Character myGuess = userInput.charAt(0);
                app.guessLetter(myGuess);
            }
        }
    }

    public String getGreeting() {
        return "Welcome! Today the word to guess is:";
    }

    private void guessLetter(Character chr) {
        if (game.guessLetter(chr)) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong...");
        }
        System.out.println(game.getWordToGuess());
        app.winLose();
    }

    private void guessPrompt() {
        String msg = "Enter one letter to guess (" + game.getRemainingAttempts() + " attempts remaining):";
        System.out.println(msg);
    }

    private void winLose() {
        if (game.isGameLost()) {
            System.out.println("You Lose!");
        }
        if (game.isGameWon()) {
            System.out.println("You Win!");
        }
    }
}
