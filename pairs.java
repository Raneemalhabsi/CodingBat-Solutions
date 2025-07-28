public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    for (int i=0 ; i<strings.length ; i++){
        String firstChar = strings[i].substring(0,1);
        String lastChar = strings[i].substring(strings[i].length()-1);
        map.put(firstChar, lastChar);
    }return map;
}
