public Map<String, String> mapAB4(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")){
        String valueA = map.get("a");
        String valueB = map.get("b");

        if (valueA.length() < valueB.length() ){
            map.put("c", valueB);
        }else if (valueA.length() > valueB.length() ){
            map.put("c", valueA);
        }else {
            map.put("a","");
            map.put("b","");
        }
    }return map;
}
