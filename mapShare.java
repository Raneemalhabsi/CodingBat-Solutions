public Map<String, String> mapShare(Map<String, String> map) {
    if (map.containsKey("a")){
        String valueA = map.get("a");
        map.put("b", valueA);

    }map.remove("c");
    return map;
}
