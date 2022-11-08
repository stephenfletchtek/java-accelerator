package game;

public class Game { 
  StringBuilder stringBuilder;

  Game(String word) {
    this.stringBuilder = new StringBuilder(word);
  }

  public String getWordToGuess() {
    int max = this.stringBuilder.length();
    for (int i = 1; i < max; i++) {
      this.stringBuilder.replace(i, i + 1, "_");
    }
    return this.stringBuilder.toString();
  }


  // Makers version
  // String word;
  // Game(String word) {
  //   this.word = word;
  // }
  // public String getWordToGuess() {
  //   StringBuilder builder = new StringBuilder();
  //   for (int i = 0; i < this.word.length(); i++) {
  //       Character currentLetter = word.charAt(0);
  //       if (i == 0) {
  //           builder.append(currentLetter);
  //       } else {
  //           builder.append("_");
  //       }
  //   }
  //   return builder.toString();
  // }
}
