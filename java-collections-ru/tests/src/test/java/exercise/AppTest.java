package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    private List<Integer> list;


    @BeforeEach
    void initList() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }

    @Test
    void testTake() {
        // BEGIN
        List listAfterMethod = App.take(list, 2);
        Assertions.assertEquals(listAfterMethod.size(), 2);
        Assertions.assertEquals(listAfterMethod.get(0), 1);
        Assertions.assertEquals(listAfterMethod.get(1), 2);
        Assertions.assertEquals(listAfterMethod, list.subList(0,2));
        // END
    }
}
