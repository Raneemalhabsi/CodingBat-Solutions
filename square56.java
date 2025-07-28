public List<Integer> square56(List<Integer> nums) {
    List<Integer> list = new ArrayList <Integer> ();
    for (int i = 0; i<nums.size(); i++){
        int square = nums.get(i) * nums.get(i) + 10;
        if (square%10 != 5 && square%10 != 6 ){
            list.add(square);
        }
    }return list;
}
