package game;

public class Game { 
  StringBuilder stringBuilder;
  int remainingAttempts;

  Game(String word) {
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

  public int getRemainingAttempts() {
    return this.remainingAttempts;
  }
}
