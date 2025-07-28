public String altPairs(String str) {
    String newString="";
    for (int i = 0; i<str.length(); i+=4){
        newString += str.charAt(i);
        if (str.length()>i+1){
            newString += str.charAt(i+1);
        }
    }return newString;
}
