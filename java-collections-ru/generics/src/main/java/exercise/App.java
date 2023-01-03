package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {

            boolean validBook = true;
            for (Map.Entry<String, String> entry : where.entrySet()) {
                String whereKey = entry.getKey();
                String whereValue = entry.getValue();

                String bookValue = book.get(whereKey);
                if (!bookValue.equalsIgnoreCase(whereValue)) {
                    validBook = false;
                    break;
                }
            }

            if (validBook) {
                result.add(book);
            }
        }
        return result;
    }
    }

//END
