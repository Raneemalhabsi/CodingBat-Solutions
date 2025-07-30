public int[] shiftLeft(int[] nums) {
    int[] array = new int[nums.length];
    for (int i = 0; i<nums.length-1; i++){
        array[i] = nums[i+1];
    }if (nums.length > 0){
        array[nums.length -1] = nums[0];
    }return array;
}
