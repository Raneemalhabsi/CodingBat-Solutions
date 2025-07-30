public int[] zeroFront(int[] nums) {
    int[] array = new int[nums.length];
    int frontIndex = 0;
    int backIndex = nums.length -1;
    for (int i = 0; i<nums.length; i++){
        if(nums[i] == 0){
            array[frontIndex] = nums[i];
            frontIndex+=1;
        }else if(nums[i]!=0){
            array[backIndex]= nums[i];
            backIndex -=1;
        }
    }return array;
}
