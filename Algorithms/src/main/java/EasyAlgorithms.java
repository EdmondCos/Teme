class EasyAlgorithms {
    

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start / 2 + end / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 1.	Write an algorithm that returns the sum of all elements in a given array of int
     * Example: array[]{10,20,30}
     * the algorithm is expected to return 60 because 10+20+30 is 60
     */
    public static long getSum(int[] v) {
        long sum = 0;
        if (v != null) {
            for (int i : v) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * 2.	Write an algorithm that reverses the order of all elements of a given array
     * Example: array[]{10,20,30} the array will look like: array[]{30,20,10}
     */
    public static void reverse(int[] v) {
        for (int i = 0; i <= v.length / 2 - 1; i++) {
            int temp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = temp;
        }
    }

    /**
     * 3.	Write an algorithm that searches for an element and returns its position if found or -1 otherwise
     * Example: array[]{8,1,2,18,20} searchFor 18; the algorithm is expected to return 3 because 18 is found at the index 3
     */
    public static int indexOf(Integer[] v, Integer value) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 4.	Write an algorithm that returns the greatest number in an array
     * Example: array[]{8,112,2,18,20} the algorithm is expected to return 112 because 112 is the greatest number of all
     */
    public static int getGreatest(int[] v) {
        int max = v[0];
        for (int i : v) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * 5.	Write an algorithm that moves at the end of the array every 0 that is present
     * Example: array[]{0,1,0,18,20} the array will look like: array[]{20,1,18,0,0}
     * The order of the other values does not matter.
     */
    public static void moveZeros(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
