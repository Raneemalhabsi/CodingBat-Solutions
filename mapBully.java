public Map<String, String> mapBully(Map<String, String> map) {
    if (map.containsKey("a")){
        String valueA = map.get("a");
        map.put("b",valueA);
        map.put("a","");
    }return map;
}
