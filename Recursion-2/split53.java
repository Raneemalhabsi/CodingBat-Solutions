public boolean split53(int[] nums) {
    return helpSplit(0, nums, 0, 0);
}

public boolean helpSplit(int start, int[] nums, int sum1, int sum2){
    if (start>= nums.length){
        if (sum1 == sum2){
            return true;
        }else{
            return false;
        }
    }
    if (nums[start] % 5 == 0){
        return helpSplit(start+1, nums, sum1 + nums[start], sum2);
    }else if (nums[start] % 3 == 0){
        return helpSplit(start+1, nums, sum1, sum2  + nums[start]);
    }else{
        if (helpSplit(start+1, nums, sum1 + nums[start], sum2)){
            return true;
        }if (helpSplit(start+1, nums, sum1, sum2  + nums[start])){
            return true;
        }else{
            return false;
        }
    }
}