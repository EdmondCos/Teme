import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {
    private MyArrayList<Integer> arr = new MyArrayList<>();
    private MyArrayList<String> arr1 = new MyArrayList<>(10);

    @Test
    public void testAdd() {
        arr1.add("abc");
        assertEquals(1, arr1.size());

        for (int i = 1; i < 16; i++) {
            arr.add(i);
        }
        assertTrue(arr.contains(13));
        assertFalse(arr.contains(-1));
        assertEquals(15, arr.size());
        arr.remove(11);
        assertFalse(arr.contains(12));
        assertEquals(14, arr.size());

    }


}
