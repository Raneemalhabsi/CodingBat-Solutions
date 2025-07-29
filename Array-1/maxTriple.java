public int maxTriple(int[] nums) {
    int middle = nums[nums.length/2];
    int last = nums[nums.length-1];
    if(nums[0]>middle && nums[0]>last){
        return nums[0];
    }else if(middle>nums[0] && middle>last){
        return middle;
    }else if(last>nums[0] && last>middle){
        return last;
    }return 0;
}
