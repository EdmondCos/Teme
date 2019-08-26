package dailyCodingProblems.lowestPositiveIntMissing;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntTest {
    private MissingInt mi = new MissingInt();

    @Test
    public void test1() {
        int[] x = {3, 4, -1, 1};
        assertEquals(2, mi.missingInt(x));
    }

    @Test
    public void test2() {
        int[] x = {3, 6, -2, 0, -1, 2, 5, 1, 4};
        assertEquals(7, mi.missingInt(x));
    }

    @Test
    public void test3() {
        int[] x = {-7, -3, -2, -5, -3};
        assertEquals(1, mi.missingInt(x));
    }

    @Test
    public void test4(){
        int[] x = {1,2,0,1,2,0,5};
        assertEquals(3, mi.missingInt(x));
    }

    @Test
    public void test5(){
        int[] x = {-1,-3,4,-2,};
        assertEquals(1, mi.missingInt(x));
    }

}