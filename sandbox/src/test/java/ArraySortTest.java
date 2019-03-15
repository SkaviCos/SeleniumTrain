import org.junit.Test;
import ru.trainjava.sandbox.ArraySort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArraySortTest {
    @Test
    public void notValidate() {
        ArraySort srt = new ArraySort();

        List<String> land = srt.ArraySort();
        List<String> srtr = new ArrayList<>();
        srtr.add("Aman");
        srtr.add("Adjad");
        srtr.add("Bahrain");
        srtr.add("Japan");
        //Collections.sort(srtr);

        assertNotEquals(srtr,land);
    }
    @Test
    public void validate() {
        ArraySort srt = new ArraySort();

        List<String> land = srt.ArraySort();
        List<String> srtr = new ArrayList<>();
        srtr.add("Aman");
        srtr.add("Adjad");
        srtr.add("Bahrain");
        srtr.add("Japan");
        Collections.sort(srtr);

        assertEquals(land,srtr);
    }
}
