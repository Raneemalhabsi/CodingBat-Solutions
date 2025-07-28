public List<Integer> square(List<Integer> nums) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i<nums.size(); i++){
        int multiSelf = nums.get(i)*nums.get(i);
        list.add(multiSelf);
    }return list;
}
