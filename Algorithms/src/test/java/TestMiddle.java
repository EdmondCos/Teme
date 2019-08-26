import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMiddle {
    private SearchInsertPosition sip = new SearchInsertPosition();
    private MergeSortedArray msa = new MergeSortedArray();

    @Test
    public void testSIP() {
        int[] v = {1, 2, 4, 6, 8, 9, 10};
        assertEquals(6, sip.searchInsert(v, 10));

        v = new int[]{1, 3};
        assertEquals(2, sip.searchInsert(v, 4));

        v = new int[]{};
        assertEquals(0, sip.searchInsert(v, 1));

        v = new int[]{2};
        assertEquals(1, sip.searchInsert(v, 3));
        assertEquals(0, sip.searchInsert(v, 2));
    }

    @Test
    public void testMergeArray() {
        int[] m = {4, 5, 6, 0, 0, 0};
        int[] n = {1, 2, 3};
        msa.merge(m, 3, n, n.length);
    }
}
