public boolean groupSum5(int start, int[] nums, int target) {
    if (start >= nums.length){
        if (target == 0){
            return true;
        }else{
            return false;
        }
    }if (nums[start] % 5 == 0){
        if (start +1 < nums.length && nums[start +1] == 1){
            return groupSum5(start +2, nums, target - nums[start]);
        }else{
            return groupSum5(start +1, nums, target - nums[start]);
        }
    }
    if (groupSum5(start +1, nums, target - nums[start])){
        return true;
    }if (groupSum5(start +1, nums, target)){
        return true;
    }else{
        return false;
    }
}
