public int[] withoutTen(int[] nums) {
    int[] array = new int[nums.length];
    int frontIndex = 0;
    for (int i = 0; i<nums.length; i++){
        if (nums[i] != 10){
            array[frontIndex] = nums[i];
            frontIndex +=1;
        }
    }return array;
}