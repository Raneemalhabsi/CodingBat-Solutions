public int[] fix34(int[] nums) {
    for (int i=0; i<nums.length-1; i++){
        if (nums[i] == 3 && nums[i+1] != 4){
            for (int j=0 ; j<nums.length; j++){
                if (nums[j] == 4 && nums[j-1] != 3){
                    int temp = nums[j];
                    nums[j] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
    }return nums;
}
