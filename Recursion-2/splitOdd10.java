public boolean splitOdd10(int[] nums) {
    return helpSplit(0, nums, 0, 0);
}
public boolean helpSplit(int start, int[] nums, int sum1, int sum2){
    if (start >= nums.length){
        if ((sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1) ){
            return true;
        }else{
            return false;
        }
    }if (helpSplit(start +1, nums, sum1 + nums[start], sum2) ){
        return true;
    }if (helpSplit(start +1, nums, sum1, sum2  + nums[start]) ){
        return true;
    }else{
        return false;
    }
}
