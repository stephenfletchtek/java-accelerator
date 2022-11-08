package game;

import java.util.Random;

public class Game { 
  StringBuilder stringBuilder;
  Integer remainingAttempts;
  static final String[] DICTIONARY = new String [] { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };

  Game() {
    String word = getRandomWordFromDictionary();
    this.stringBuilder = new StringBuilder(word);
    this.remainingAttempts = 10;
  }

  public String getWordToGuess() {
    int max = this.stringBuilder.length();
    for (int i = 1; i < max; i++) {
      this.stringBuilder.replace(i, i + 1, "_");
    }
    return this.stringBuilder.toString();
  }

  public Integer getRemainingAttempts() {
    return this.remainingAttempts;
  }

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[(rand.nextInt(DICTIONARY.length - 1))];
  }
}
