public Map<String, String> mapAB2(Map<String, String> map) {
    if(map.containsKey("a") && map.containsKey("b")){
        String valueA =  map.get("a");
        String valueB = map.get("b");
        if (valueA.equals(valueB)){
            map.remove("a");
            map.remove("b");
        }
    }return map;
}
