public int[] pre4(int[] nums) {
    int index4 = 0;
    for (int i=0; i<nums.length; i++){
        if (nums[i] == 4){
            index4 = i;
            break;
        }
    }
    int[] array = new int[index4];
    for (int i=0; i<index4; i++){
        array[i] = nums[i];
    }return array;
}
