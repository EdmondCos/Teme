
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestEasy {

    @Test
    public void binarySort() {
        int v[] = new int[]{1, 2, 3, 4, 5};
        assertEquals(1, EasyAlgorithms.binarySearch(v, 2));

        v = new int[]{};
        assertEquals(-1, EasyAlgorithms.binarySearch(v, 2));

        v = new int[]{2};
        assertEquals(0, EasyAlgorithms.binarySearch(v, 2));

    }

    @Test
    public void testGetSum() {
        System.out.println("Testing getSum");
        int v[] = new int[]{10, 20, 30};
        assertEquals(60, EasyAlgorithms.getSum(v));
        System.out.println("1st test passed");

        v = new int[]{17};
        assertEquals(17, EasyAlgorithms.getSum(v));
        System.out.println("2nd test passed");

        v = new int[]{};
        assertEquals(0, EasyAlgorithms.getSum(v));
        System.out.println("3rd test passed");

        v = null;
        assertEquals(0, EasyAlgorithms.getSum(v));

        v = new int[]{2_000_000_000, 2_000_000_000};
        assertEquals(4_000_000_000L, EasyAlgorithms.getSum(v));

        System.out.println("Bravo! getSum algorithm is correct");
    }

    @Test
    public void testReverse() {
        System.out.println("Testing reverse");
        int v[] = new int[]{10, 20, 30};
        EasyAlgorithms.reverse(v);
        assertEquals(3, v.length);
        assertEquals(30, v[0]);
        assertEquals(20, v[1]);
        assertEquals(10, v[2]);
        System.out.println("1st test passed");

        v = new int[]{17, 6, 1, 9};
        EasyAlgorithms.reverse(v);
        assertEquals(4, v.length);
        assertEquals(9, v[0]);
        assertEquals(1, v[1]);
        assertEquals(6, v[2]);
        assertEquals(17, v[3]);
        System.out.println("2nd test passed");

        v = new int[]{10};
        EasyAlgorithms.reverse(v);
        assertEquals(1, v.length);
        assertEquals(10, v[0]);
        System.out.println("3rd test passed");

        v = new int[]{};
        EasyAlgorithms.reverse(v);
        assertEquals(0, v.length);
        System.out.println("4th test passed");

        System.out.println("Bravo! reverse algorithm is correct");
    }

    @Test
    public void testIndexOf() {
        System.out.println("Testing indexOf");
        Integer v[] = new Integer[]{10, 20, 30};
        for (int i = 0; i < v.length; ++i)
            assertEquals(i, EasyAlgorithms.indexOf(v, v[i]));
        assertEquals(-1, EasyAlgorithms.indexOf(v, 100));
        System.out.println("1st test passed");

        v = new Integer[]{10};
        assertEquals(0, EasyAlgorithms.indexOf(v, 10));
        assertEquals(-1, EasyAlgorithms.indexOf(v, 100));
        System.out.println("2nd test passed");

        v = new Integer[]{};
        assertEquals(-1, EasyAlgorithms.indexOf(v, 8));
        System.out.println("3rd test passed");

        System.out.println("Bravo! indexOf algorithm is correct");
    }

    @Test
    public void testGetGreatest() {
        System.out.println("Testing getGreatest");
        int v[] = new int[]{10, 20, 30};
        assertEquals(30, EasyAlgorithms.getGreatest(v));
        System.out.println("1st test passed");

        v = new int[]{10};
        assertEquals(10, EasyAlgorithms.getGreatest(v));
        System.out.println("2nd test passed");

        v = new int[]{3, 2, 1};
        assertEquals(3, EasyAlgorithms.getGreatest(v));
        System.out.println("3rd test passed");

        v = new int[]{2, 3, 1};
        assertEquals(3, EasyAlgorithms.getGreatest(v));
        System.out.println("4th test passed");

        v = new int[]{-3, -2, -1};
        assertEquals(-1, EasyAlgorithms.getGreatest(v));
        System.out.println("5th test passed");

        System.out.println("Bravo! getGreatest algorithm is correct");
    }

    @Test
    public void testMoveZeros() {
        System.out.println("Testing moveZeros");
        int v[] = new int[]{0, 1, 0, 3, 12};
        EasyAlgorithms.moveZeros(v);
        assertEquals(5, v.length);
        assertEquals(0, v[4]);
        assertEquals(0, v[3]);
        assertEquals(16, v[0] + v[1] + v[2]);
        System.out.println("1st test passed");

        v = new int[]{0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9};
        EasyAlgorithms.moveZeros(v);
        assertEquals(18, v.length);
        assertEquals(0, v[9]);
        assertEquals(0, v[10]);
        assertEquals(0, v[11]);
        assertEquals(0, v[12]);
        assertEquals(0, v[13]);
        assertEquals(0, v[14]);
        assertEquals(0, v[15]);
        assertEquals(0, v[16]);
        assertEquals(0, v[17]);
        assertEquals(45, v[0] + v[1] + v[2] + v[3] + v[4] + v[5] + v[6] + v[7] + v[8]);

        System.out.println("2nd test passed");

        v = new int[]{0};
        EasyAlgorithms.moveZeros(v);
        assertEquals(1, v.length);
        assertEquals(0, v[0]);
        System.out.println("3rd test passed");

        v = new int[]{10};
        EasyAlgorithms.moveZeros(v);
        assertEquals(1, v.length);
        assertEquals(10, v[0]);
        System.out.println("4th test passed");

        v = new int[]{};
        EasyAlgorithms.moveZeros(v);
        assertEquals(0, v.length);
        System.out.println("5th test passed");

        System.out.println("Bravo! moveZeros algorithm is correct");
    }
}
