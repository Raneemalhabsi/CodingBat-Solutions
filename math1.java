public List<Integer> math1(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        int mult10 = (nums.get(i)+1)*10;
        list.add(mult10);
    }return list;
}

