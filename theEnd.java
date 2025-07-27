public String theEnd(String str, boolean front) {
    String newString="";
    if(front){
        newString += str.charAt(0);
    }else{
        newString += str.charAt(str.length()-1);
    }return newString;
}
