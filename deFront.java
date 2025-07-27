public String deFront(String str) {
    String newString="";
    if (str.charAt(0)=='a' && str.charAt(1)!='b'){
        newString = "a" + str.substring (2);
    }else if (str.charAt(0)!='a' && str.charAt(1)=='b'){
        newString = str.substring(1);
    }else if (str.charAt(0)=='a' && str.charAt(1)=='b'){
        newString = str;
    }else {
        newString = str.substring(2);
    }return newString;
}
