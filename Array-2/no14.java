public boolean no14(int[] nums) {
    boolean contains1 = false;
    boolean contains4 = false;
    for (int i = 0; i<nums.length; i++){
        if (nums[i] == 1){
            contains1 = true;
        }if (nums[i] == 4){
            contains4 = true;
        }
    }if (contains1 && contains4){
        return false;
    }else{
        return true;
    }
}
