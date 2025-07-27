public String stringX(String str) {
    if (str.length()==0){
        return "";
    }
    if (str.length() <=2){
        return str;
    }
    String newString="" + str.charAt(0);
    for (int i = 1; i < str.length()-1; i++){
        if (str.charAt(i) != 'x'){
            newString += str.charAt(i);
        }
    }
    newString += str.charAt(str.length()-1);
    return newString;
}
