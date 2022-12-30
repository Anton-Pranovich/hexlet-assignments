package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> map = new HashMap<>();
        if (text.isBlank()) {
            return map;
        }
        String[] wordsArray = text.split(" ");
        for (String word: wordsArray) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.size() == 0) {
            return "{}";
        }
        StringBuilder print = new StringBuilder("{");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            print.append("\n  %s: %d".formatted(key, value));
        }
        print.append("\n}");
        return print.toString();
    }
}
//END
