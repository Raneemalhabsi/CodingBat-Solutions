public int countClumps(int[] nums) {
    int counter = 0;
    for (int i=0 ; i<nums.length-1; i++){
        if (nums[i] == nums[i+1]){
            if (i==0 || nums[i] != nums[i-1]){
                counter +=1;
            }
        }
    }return counter;
}
