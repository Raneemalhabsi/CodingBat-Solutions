public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    for (int i=0; i<strings.length; i++){
        String firstchar = String.valueOf(strings[i].charAt(0));
        if (map.containsKey(firstchar)){
            String valueFirstchar = map.get(firstchar);
            map.put(firstchar,valueFirstchar + strings[i] );
        }else{
            map.put(firstchar, strings[i]);
        }
    }return map;
}
