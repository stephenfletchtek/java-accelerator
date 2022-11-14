package intellij_game;

import java.util.ArrayList;

public class Masker {
    public String getMaskedWord(String word, ArrayList<Character> guessed) {
        StringBuilder stringBuilder = new StringBuilder(word);
        for (int i = 1; i < word.length(); i++) {
            if (guessed.indexOf(word.charAt(i)) == -1) {
                stringBuilder.replace(i, i + 1, "_");
            }
        }
        return stringBuilder.toString();
    }
}
