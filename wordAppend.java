public String wordAppend(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    String result="";
    for (int i=0; i< strings.length; i++){
        if (map.containsKey(strings[i])){
            map.put(strings[i], map.get(strings[i])+1);
        }else{
            map.put(strings[i], 1);
        }if ((map.get(strings[i])) % 2 == 0 ){
            result += strings[i];
        }
    }return result;
}
