package intellij_game;

import java.util.ArrayList;

public class Game {
    private Integer remainingAttempts = 10;
    private final Masker masker;
    private final String word;
    private final ArrayList<Character> guessed = new ArrayList<Character>();
    private final String playerName;
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
        if (!guessed.contains(chr)) {
            guessed.add(chr);
        }
        return true;
    }

    public Boolean isGameLost() {
        return remainingAttempts < 1;
    }

    public Boolean isGameWon() {
        for (int i = 1; i < word.length(); i++) {
            if (!guessed.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Character> getGuessed() {
        return guessed;
    }

    public Integer getRemainingAttempts() {
        return remainingAttempts;
    }

    public String getPlayerName() {
        return playerName;
    }
}