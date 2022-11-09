package game;

public class Game {

  Integer remainingAttempts = 10;
  WordChooser wordChooser;

  public Game(WordChooser chooser) {
    wordChooser = chooser;
  }
   
  public String getWordToGuess(String word) {
    StringBuilder stringBuilder = new StringBuilder(word);
    for (int i = 1; i < word.length(); i++) {
      stringBuilder.replace(i, i + 1, "_");
    }
    return stringBuilder.toString();
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }

  public String getRandomWordFromDictionary() {
    return wordChooser.getRandomWordFromDictionary();
  }
}
