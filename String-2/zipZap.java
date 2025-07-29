public String zipZap(String str) {
    String newStr = "";
    for (int i =0; i<str.length() ; i++){
        if(i<=str.length()-3 && str.charAt(i)=='z' && str.charAt(i+2)=='p'){
            newStr+= "zp";
            i+=2;
        }else{
            newStr+= str.charAt(i);
        }
    }return newStr;
}
