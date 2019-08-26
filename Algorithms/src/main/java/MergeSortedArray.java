class MergeSortedArray {
    void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        } else if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        for (int i = nums1.length - 1; i > 0; i--) {
            if (n < 1 || m < 1) {
                break;
            } else if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m--;
            } else if (nums1[m - 1] < nums2[n - 1]) {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }

        if (m < 1) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
    }
}
