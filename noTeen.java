public List<Integer> noTeen(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        if (!(nums.get(i)>=13 && nums.get(i)<=19)){
            list.add(nums.get(i));
        }
    }return list;
}
