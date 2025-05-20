class NextPermutation {
    public void nextPermutation(int[] nums) {
        int breakpoint = 0;
        int count=0;
        for (int n = nums.length - 2; n >= 0; n--) {
            if (nums[n] < nums[n + 1]) {
                count++;
                breakpoint = n;
                break;
            }
        }
        for (int n = nums.length - 1; n > breakpoint; n--) {
            if (nums[n] > nums[breakpoint]) {
                swap(nums, breakpoint, n);
                break;
            }
        }

        reverse(nums, breakpoint+1,nums.length-1);

        if (breakpoint == 0 && count==0) {
            java.util.Arrays.sort(nums);
        } else {
            return; 
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

     public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}