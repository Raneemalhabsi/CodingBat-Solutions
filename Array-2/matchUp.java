public int matchUp(int[] nums1, int[] nums2) {
    int counter = 0;
    for (int i = 0; i<nums1.length; i++){
        if ((Math.abs(nums1[i] - nums2[i]) <=2) && nums1[i] != nums2[i]){
            counter+=1;
        }
    }return counter;
}
