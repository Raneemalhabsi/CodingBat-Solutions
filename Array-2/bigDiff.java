public int bigDiff(int[] nums) {
    int small = nums[0];
    int large = nums[0];
    for (int i = 0; i<nums.length; i++){
        small = Math.min(small, nums[i]);
        large = Math.max(large, nums[i]);
    }return large - small;
}

