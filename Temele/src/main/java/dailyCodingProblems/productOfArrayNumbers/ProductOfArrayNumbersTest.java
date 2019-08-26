package dailyCodingProblems.productOfArrayNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayNumbersTest {
    private ProductOfArrayNumbers x = new ProductOfArrayNumbers();

    @Test
    public void testProd1(){
        int[] arr = {1,2,3,4,5};
        int[] result = {120,60,40,30,24};
        assertArrayEquals(result,x.arrayProduct(arr));
    }

    @Test
    public void testProd2(){
        int[] arr = null;
        int[] result = {0};
        assertArrayEquals(result,x.arrayProduct(arr));
    }

    @Test
    public void testProd3(){
        int[] arr = {3,2,1};
        int[] result = {2,3,6};
        assertArrayEquals(result,x.arrayProduct(arr));
    }

}