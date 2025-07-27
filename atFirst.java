public String atFirst(String str) {
    String newString="";
    if (str.length()>=2){
        newString = str.substring(0,2);
    }else if(str.length() == 1){
        newString = str.substring(0) + "@";
    }else{
        newString = "@@";
    }
    return newString;
}
