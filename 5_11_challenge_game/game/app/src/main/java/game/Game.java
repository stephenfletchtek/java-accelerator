package game;

import java.util.ArrayList;

public class Game {
  Integer remainingAttempts = 10;
  String word;
  ArrayList<Character> guessed;

  public Game(WordChooser chooser) {
    word = chooser.getRandomWordFromDictionary();
    guessed = new ArrayList<Character>();
  }
   
  public String getWordToGuess() {
    StringBuilder stringBuilder = new StringBuilder(word);
    for (int i = 1; i < word.length(); i++) {
      stringBuilder.replace(i, i + 1, "_");
    }
    return stringBuilder.toString();
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }

  public boolean guessLetter(Character chr) {
    if (word.indexOf(chr) == -1) { 
      remainingAttempts --;
      return false;
    }
    guessed.add(chr);
    return true;
  }
}
