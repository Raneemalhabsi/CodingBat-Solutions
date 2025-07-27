public String without2(String str) {
    String newString="";
    if (str.length()<2){
        newString = str;
    }else{
        String start= str.substring(0,2);
        String end=str.substring(str.length()-2);
        if (start.equals(end)){
            newString = str.substring(2);
        }else{
            newString = str;
        }
    }return newString;
}