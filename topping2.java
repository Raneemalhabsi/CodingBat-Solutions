public Map<String, String> topping2(Map<String, String> map) {
    if (map.containsKey("ice cream")){
        String valueIcecream = map.get("ice cream");
        map.put("yogurt", valueIcecream);
    }if (map.containsKey("spinach")){
        map.put("spinach","nuts");
    }return map;
}
