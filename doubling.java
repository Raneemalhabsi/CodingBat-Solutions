public List<Integer> doubling(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        int doubleInt = nums.get(i)*2;
        list.add(doubleInt);
    }return list;
}
