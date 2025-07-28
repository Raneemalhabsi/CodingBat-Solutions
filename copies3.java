public List<String> copies3(List<String> strings) {
    List<String> list = new ArrayList<String>();
    for (int i = 0; i<strings.size(); i++){
        String copies = strings.get(i) + strings.get(i) + strings.get(i) ;
        list.add(copies);
    }return list;
}


