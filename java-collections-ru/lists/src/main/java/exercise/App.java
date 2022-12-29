package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static <E> boolean scrabble(String chars, String word) {
        List<String> charList = Arrays.asList(chars.split(""));
        List<String> wordList = Arrays.asList(word.split(""));
        int wordSize = word.length();
        List<Integer> indexArray = new ArrayList<>();
        for (int wordListIndex = 0; wordListIndex < wordList.size(); wordListIndex++) {
            for (int charListIndex = 0; charListIndex < charList.size(); charListIndex++) {
                if ((charList.get(charListIndex).equalsIgnoreCase(wordList.get(wordListIndex))) && (!indexArray.contains(charListIndex))) {
                    indexArray.add(charListIndex);
                    wordSize--;
                    if (wordListIndex + 1 < wordList.size()) {
                        wordListIndex++;
                        charListIndex = -1;
                    } else {
                        break;
                    }
                }
            }
        }
        return wordSize < 1;
    }
}
//END
