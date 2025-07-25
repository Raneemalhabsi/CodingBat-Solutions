public String backAround(String str) {
    String newString="";
    char lastChar = str.charAt(str.length()-1);
    newString += lastChar;
    for (int i =0; i< str.length();i++){
        newString += str.charAt(i);
    }
    newString += lastChar;
    return newString;
}