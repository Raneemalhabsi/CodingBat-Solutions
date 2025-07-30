public boolean either24(int[] nums) {
    boolean contains22 = false;
    boolean contains44 = false;
    for (int i = 0; i<nums.length-1; i++){
        if (nums[i]==2 && nums[i+1]==2){
            contains22 = true;
        }if (nums[i]==4 && nums[i+1]==4){
            contains44 = true;
        }
    }if (contains22 && contains44){
        return false;
    }if (contains22 || contains44){
        return true;
    }return false;
}
