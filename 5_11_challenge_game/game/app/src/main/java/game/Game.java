package game;

import java.util.ArrayList;

public class Game {
  private Integer remainingAttempts = 10;
  private String word;
  private ArrayList<Character> guessed = new ArrayList<Character>();

  public Game(WordChooser chooser) {
    word = chooser.getRandomWordFromDictionary();
  }
   
  public String getWordToGuess() {
    StringBuilder stringBuilder = new StringBuilder(word);
    for (int i = 1; i < word.length(); i++) {
      if (guessed.indexOf(word.charAt(i)) == -1) {
        stringBuilder.replace(i, i + 1, "_");
      }
    }
    return stringBuilder.toString();
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
}
