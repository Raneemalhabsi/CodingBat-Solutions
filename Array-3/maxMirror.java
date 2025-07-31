public int maxMirror(int[] nums) {
    int max = 0;
    for (int i = 0; i<nums.length; i++){
        for (int j = nums.length -1; j>=0; j--){
            int counter = 0;
            for (int k=0; i+k<nums.length && j-k>=0; k++){
                if(nums[i+k] == nums[j-k]){
                    counter+=1;
                }else{
                    break;
                }
            }if (counter > max){
                max = counter;
            }
        }
    }return max;
}
