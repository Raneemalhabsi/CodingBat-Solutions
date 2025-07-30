public int[] post4(int[] nums) {
    int index4 = 0;
    for (int i=0; i<nums.length; i++){
        if (nums[i] == 4){
            index4 = i;
        }
    }
    int[] array = new int[nums.length - index4 -1];
    int j = 0;
    for (int i=index4 + 1; i<nums.length; i++){
        array[j] = nums[i];
        j++;
    }return array;
}

