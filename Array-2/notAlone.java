public int[] notAlone(int[] nums, int val) {
    int large = 0;
    for (int i = 1; i<nums.length-1; i++){
        if (nums[i]==val && nums[i-1] != val && nums[i+1] != val){
            large = Math.max(nums[i-1] , nums[i+1]);
            nums[i] = large;
        }
    }return nums;
}
