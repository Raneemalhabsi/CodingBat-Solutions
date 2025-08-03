public boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length){
        if (target == 0){
            return true;
        }else{
            return false;
        }
    }
    int i = start + 1;
    while (i< nums.length && nums[i] == nums[start] ){
        i += 1;
    }
    int sumClump = 0;
    for (int j=start; j < i; j++){
        sumClump += nums[j];
    }
    if (groupSumClump(i, nums, target - sumClump)){
        return true;
    }if (groupSumClump(i, nums, target)){
        return true;
    }else{
        return false;
    }
}
