public Map<String, String> mapAB(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")){
        String valueA = map.get("a");
        String valueB =map.get("b");
        String ab = map.put("ab", valueA + valueB);
    }return map;
}
