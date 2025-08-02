public int[] copyEndy(int[] nums, int count) {
    int[] array = new int[count];
    int arrayIndex = 0;
    for (int i=0; i<nums.length; i++){
        if (isEndy(nums[i])){
            array[arrayIndex] = nums[i];
            arrayIndex +=1;
        }if (arrayIndex == count){
            break;
        }
    }return array;

}

public boolean isEndy(int n){
    if ((n>=0 && n<=10) || (n>=90 && n<=100)){
        return true;
    }return false;
}