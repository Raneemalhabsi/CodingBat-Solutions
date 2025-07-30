public boolean haveThree(int[] nums) {
    int counter = 0;
    for (int i=0 ; i<nums.length ; i++){
        if (nums[i] == 3){
            counter +=1;
            if (i+1< nums.length && nums[i+1] == 3){
                return false;
            }
        }
    }if (counter == 3){
        return true;
    }else{
        return false;
    }
}
