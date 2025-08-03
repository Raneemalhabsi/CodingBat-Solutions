public String mirrorEnds(String string) {
    String newString="";
    for (int i=0; i<string.length(); i++){
        if (string.charAt(i) == string.charAt(string.length() -1 -i)){
            newString += string.charAt(i);
        }else{
            break;
        }
    }return newString;
}
