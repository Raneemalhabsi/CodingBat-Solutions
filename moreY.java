public List<String> moreY(List<String> strings) {
    List<String> list = new ArrayList<String>();
    for (int i = 0; i<strings.size(); i++){
        String moreY = "y" + strings.get(i) + "y" ;
        list.add(moreY);
    }return list;
}




