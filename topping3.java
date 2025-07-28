public Map<String, String> topping3(Map<String, String> map) {
    if (map.containsKey("potato")){
        String valuePotato = map.get("potato");
        map.put("fries",valuePotato);
    }if (map.containsKey("salad")){
        String valueSalad = map.get("salad");
        map.put("spinach",valueSalad);
    }return map;
}
