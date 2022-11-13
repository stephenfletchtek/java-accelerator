package game;

import java.util.ArrayList;

public class Game {
  private Integer remainingAttempts = 10;
  private Masker masker;
  private String word;
  private ArrayList<Character> guessed = new ArrayList<Character>();

  public Game(WordChooser chooser, Masker masker) {
    word = chooser.getRandomWordFromDictionary();
    this.masker = masker;
  }
   
  public String getWordToGuess() {
    return masker.getMaskedWord(word, guessed);
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
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

  public Boolean isGameLost() {
    if (remainingAttempts < 1) {
        return true;
    }
    return false;
  }

  public Boolean isGameWon() {
      for (int i = 1; i < word.length(); i++) {
          if (guessed.indexOf(word.charAt(i)) == -1) {
              return false;
          }
      }
      return true;
  }
}
