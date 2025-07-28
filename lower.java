public List<String> lower(List<String> strings) {
    List<String> list = new ArrayList <String> ();
    for (int i = 0; i<strings.size(); i++){
        String low = strings.get(i).toLowerCase();
        list.add(low);
    }return list;
}


