public List<String> noYY(List<String> strings) {
    List<String> list = new ArrayList<String>();
    for (int i=0 ; i< strings.size(); i++){
        String addY = strings.get(i) + "y";
        if (!addY.contains("yy")){
            list.add(addY);
        }
    }return list;
}

