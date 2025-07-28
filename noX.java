public List<String> noX(List<String> strings) {
    List<String> list = new ArrayList <String> ();
    for (int i = 0; i<strings.size(); i++){
        String replaceX = strings.get(i).replace("x","");
        list.add(replaceX);
    }return list;
}
