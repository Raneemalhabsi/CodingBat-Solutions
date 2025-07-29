public String repeatFront(String str, int n) {
    String newStr="";
    for (int i=n; i>0; i--){
        newStr += str.substring(0,i);
    }return newStr;
}
