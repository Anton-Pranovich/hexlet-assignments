package exercise;

//import org.junit.platform.commons.util.StringUtils;
import java.util.List;
import java.util.Arrays;

// BEGIN
public class App{
    public static long getCountOfFreeEmails(List<String> list){

        return list.stream()
//                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("yandex.ru") || email.endsWith("hotmail.com"))
                .count();
    }
}
// END
