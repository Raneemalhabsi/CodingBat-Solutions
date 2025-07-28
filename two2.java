public List<Integer> two2(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        int mult2 = nums.get(i)*2;
        if (mult2%10 != 2){
            list.add(mult2);
        }
    }return list;
}
