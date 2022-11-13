package game;

import java.util.Scanner;

public class App {
    static App app;
    static Game game;
    static Scanner scanner;

    public App() {
        game = new Game(new WordChooser());
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        app = new App();

        System.out.println(app.getGreeting());
        System.out.println(game.getWordToGuess());
        
        while (game.getRemainingAttempts() > 0) {
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

    public void guessLetter(Character chr) {
        if (game.guessLetter(chr)) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong...");
        }
        System.out.println(game.getWordToGuess());
    }

    public Boolean isGameLost() {
        return false;
    }

    private void guessPrompt() {
        String msg = "Enter one letter to guess (" + game.getRemainingAttempts() + " attempts remaining):";
        System.out.println(msg);
    }
}
