package dailyCodingProblems.lowestPositiveIntMissing;

import java.util.Arrays;

class MissingInt {
    int missingInt(int[] array) {
        // assuming array is not empty

        Arrays.sort(array);

        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] + 1 > 0 && (array[i] + 1 != array[i + 1] && array[i] != array[i + 1])) {
                    return array[i] + 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (array[array.length - 2] < 1) {
                return 1;
            } else {
                return array[array.length - 1] + 1;
            }
        }
        return 1;
    }
}
