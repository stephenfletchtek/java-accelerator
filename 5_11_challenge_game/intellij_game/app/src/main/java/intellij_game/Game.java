package intellij_game;

import java.util.ArrayList;

public class Game {
    private Integer remainingAttempts = 10;
    private Masker masker;
    private String word;
    private ArrayList<Character> guessed = new ArrayList<Character>();
    private String playerName;
    public Game(WordChooser chooser, Masker masker, String playerName) {
        word = chooser.getRandomWordFromDictionary();
        this.masker = masker;
        this.playerName = playerName;
    }

    public String getWordToGuess() {
        return masker.getMaskedWord(word, guessed);
    }

    public Boolean guessLetter(Character chr) {
        if (word.indexOf(chr) == -1) {
            remainingAttempts --;
            return false;
        }
        if (guessed.indexOf(chr) == -1) {
            guessed.add(chr);
        }
        return true;
    }

    public ArrayList<Character> getGuessed() {
        return guessed;
    }

    public Integer getRemainingAttempts() {
        return remainingAttempts;
    }
}