public String[] firstSwap(String[] strings) {
    Map <String, Integer> map = new HashMap <String, Integer>();
    for (int i =0 ; i<strings.length; i++){
        String firstChar = strings[i].substring(0,1);
        if (map.containsKey(firstChar)){
            int value = map.get(firstChar);
            if (value != -1){
                String newStr = strings[i];
                strings[i] = strings[value];
                strings[value] = newStr;

                map.put(firstChar, -1);
            }
        }else{
            map.put(firstChar, i);
        }
    }return strings;
}
