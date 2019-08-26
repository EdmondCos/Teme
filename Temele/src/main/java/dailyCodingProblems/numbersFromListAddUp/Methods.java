package dailyCodingProblems.numbersFromListAddUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Methods {
    boolean isSum(int[] lst, int k) {
        if (lst.length == 0) {
            return false;
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i : lst) {
            list.add(i);
        }

        int temp;
        for (int i = 0; i < lst.length; i++) {
            temp = k - lst[i];
            if (list.contains(temp) && Collections.frequency(list, lst[i]) > 1) {
                return true;
            }
        }
        return false;

    }
}
