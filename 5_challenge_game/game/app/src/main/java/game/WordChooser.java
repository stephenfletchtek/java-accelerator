package game;

import java.util.Random;

public class WordChooser {
  String word;
  static final String[] DICTIONARY = new String [] { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };
 
  public WordChooser() {
    word = getRandomWordFromDictionary();
  }
   
  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[(rand.nextInt(DICTIONARY.length - 1))];
  }
}
