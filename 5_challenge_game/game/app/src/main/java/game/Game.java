package game;

import java.util.Random;

public class Game { 
  StringBuilder stringBuilder = new StringBuilder(getRandomWordFromDictionary());
  Integer remainingAttempts = 10;
  static final String[] DICTIONARY = new String [] { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };

  public Game() {}

  public String getWordToGuess() {
    int max = stringBuilder.length();
    for (int i = 1; i < max; i++) {
      stringBuilder.replace(i, i + 1, "_");
    }
    return stringBuilder.toString();
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[(rand.nextInt(DICTIONARY.length - 1))];
  }
}
