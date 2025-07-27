public String lastChars(String a, String b) {
    String newString="";
    if (a.length()>=1){
        newString += a.charAt(0);
    }else{
        newString += "@";
    }if (b.length()>1){
        newString += b.charAt(b.length()-1);
    }else{
        newString += "@";
    }return newString;
}
