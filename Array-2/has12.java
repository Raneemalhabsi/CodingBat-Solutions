public boolean has12(int[] nums) {
    boolean contains1 =false;
    for (int i = 0; i<nums.length; i++){
        if (nums[i] == 1){
            contains1 = true;
        }if (contains1 && nums[i] == 2){
            return true;
        }
    }return false;
}
