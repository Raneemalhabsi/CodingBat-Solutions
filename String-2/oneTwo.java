public String oneTwo(String str) {
    String newStr="";
    for (int i =0; i<=str.length()-3 ; i+=3){
        String sub = str.substring(i, i+3);
        newStr += sub.substring(1,3) + sub.charAt(0);
    }return newStr;
}
