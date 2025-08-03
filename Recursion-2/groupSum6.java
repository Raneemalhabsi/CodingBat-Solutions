public boolean groupSum6(int start, int[] nums, int target) {
    if (start >= nums.length){
        if (target == 0){
            return true;
        }else{
            return false;
        }
    }if (nums[start] == 6){
        return groupSum6(start+1, nums, target - nums[start]);
    }
    if (groupSum6(start +1, nums, target - nums[start])){
        return true;
    }if (groupSum6(start +1, nums, target)){
        return true;
    }else{
        return false;
    }
}