package game;

public class Game {

  Integer remainingAttempts = 10;
  String word;

  public Game(WordChooser chooser) {
    word = chooser.getRandomWordFromDictionary();
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
}
