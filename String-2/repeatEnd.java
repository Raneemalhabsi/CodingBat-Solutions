public String repeatEnd(String str, int n) {
    String newStr="";
    String sub = str.substring(str.length()-n);
    for (int i=0; i<n; i++){
        newStr += sub;
    }return newStr;
}
