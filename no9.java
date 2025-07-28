public List<Integer> no9(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        if (nums.get(i)%10 != 9){
            list.add(nums.get(i));
        }
    }return list;
}
