public int[] evenOdd(int[] nums) {
    int[] array = new int[nums.length];
    int frontIndex = 0;
    int backIndex = nums.length - 1;
    for (int i = 0; i<nums.length; i++){
        if (nums[i] % 2 == 0){
            array[frontIndex] = nums[i];
            frontIndex ++;
        }else{
            array[backIndex] = nums[i];
            backIndex --;
        }
    }return array;
}
