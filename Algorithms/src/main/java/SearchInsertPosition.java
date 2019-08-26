class SearchInsertPosition {
    int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums[0] >= target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }

        int start = 0;
        int mid = nums.length / 2 - 1;
        int temp = nums.length - 1;

        boolean bol = true;
        while (bol) {
            if (nums[start] <= target && nums[mid] >= target) {
                if (target == nums[start]) {
                    return start;
                }
                if (target == nums[mid]) {
                    return mid;
                }
                temp = mid;
                mid = start / 2 + mid / 2;
            } else if (target >= nums[mid + 1] && target <= nums[temp]) {
                if (target == nums[mid + 1]) {
                    return mid + 1;
                }
                start = mid + 1;
                mid = temp;
            } else {
                bol = false;
            }
        }
        return mid + 1;
    }
}
