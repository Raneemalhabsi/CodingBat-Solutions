public String sameEnds(String string) {
    String newString = "";
    for (int i = 0; i<string.length()/2; i++){
        if (string.substring(0,i+1).equals(string.substring(string.length() -i -1))){
            newString = string.substring(0,i+1);
        }
    }return newString;
}
