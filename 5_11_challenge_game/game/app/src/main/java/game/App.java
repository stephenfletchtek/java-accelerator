package game;

import java.util.Scanner;

public class App {
    static App app;
    static Game game;
    static Scanner scanner;

    public String getGreeting() {
        return "Welcome! Today the word to guess is:";
    }

    public static void main(String[] args) {
        app = new App();
        game = new Game(new WordChooser());
        scanner = new Scanner(System.in);

        System.out.println(app.getGreeting());
        System.out.println(game.getWordToGuess());

        Character myGuess;
        
        while (game.getRemainingAttempts() > 0) {
            app.guessPrompt();
            myGuess = scanner.nextLine().charAt(0);
            app.guessLetter(myGuess);
        }
    }

    private void guessPrompt() {
        String msg = "Enter one letter to guess (" + game.getRemainingAttempts() + " attempts remaining):";
        System.out.println(msg);
    }

    private void guessLetter(Character chr) {
        if (game.guessLetter(chr)) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong...");
        }
        System.out.println(game.getWordToGuess());
    }
}
