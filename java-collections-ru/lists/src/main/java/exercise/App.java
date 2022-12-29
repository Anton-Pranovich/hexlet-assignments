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
        for (int i = 0; i < wordList.size(); i++) {
            for (int index = 0; index < charList.size(); index++) {
//	            	boolean b = (charList.get(index).equalsIgnoreCase(wordList.get(i)))&&(!indexArray.contains(index));
                if ((charList.get(index).equalsIgnoreCase(wordList.get(i)))&&(!indexArray.contains(index))) {
                    indexArray.add(index);
                    wordSize--;
                    if(i+1 < wordList.size()) {
                        i++;
                    }
                }
            }
        }
        return wordSize < 1;
    }
}
//END
