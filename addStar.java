public List<String> addStar(List<String> strings) {
    List<String> list = new ArrayList<String>();
    for (int i = 0; i<strings.size(); i++){
        String addStar = strings.get(i) + "*";
        list.add(addStar);
    }return list;
}
