public String everyNth(String str, int n) {
    String newString="";
    for (int i=0 ; i<str.length(); i+=n){
        newString += str.charAt(i);
    }return newString;
}
