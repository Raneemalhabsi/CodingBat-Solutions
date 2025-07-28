public String stringYak(String str) {
    String newString = "";
    for (int i = 0; i< str.length(); i++){
        if (str.length() > i+2 && str.charAt(i) == 'y' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'k'){
            i+=2;
        }else {
            newString += str.charAt(i);
        }
    }return newString;
}
