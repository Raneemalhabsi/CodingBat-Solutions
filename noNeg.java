public List<Integer> noNeg(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        if (nums.get(i) >= 0){
            list.add(nums.get(i));
        }
    }return list;
}
