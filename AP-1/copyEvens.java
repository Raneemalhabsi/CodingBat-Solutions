public int[] copyEvens(int[] nums, int count) {
    int[] array = new int[count];
    int indexArray = 0;
    for (int i=0; i<nums.length; i++){
        if(nums[i] % 2 == 0){
            array[indexArray] = nums[i];
            indexArray +=1;
        }if (indexArray == count){
            break;
        }
    }return array;
}
