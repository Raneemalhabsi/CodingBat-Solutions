public List<Integer> rightDigit(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        int right = nums.get(i) % 10;
        list.add(right);
    }return list;
}
