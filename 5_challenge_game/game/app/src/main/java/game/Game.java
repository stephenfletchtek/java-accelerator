package game;

public class Game { 
  String wordToGuess;
  StringBuilder stringBuilder;

  Game(String word) {
    super();
    stringBuilder = new StringBuilder(word);
  }

  public StringBuilder getWordToGuess() {
    stringBuilder.replace(1,6,"_____");
    return stringBuilder;
  }
}
