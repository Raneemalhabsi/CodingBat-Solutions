public int[] tenRun(int[] nums) {
    for (int i = 1; i<nums.length; i++){
        if (nums[i-1] % 10 == 0 && nums[i] % 10 != 0){
            nums[i] = nums[i-1];
        }
    }return nums;
}
