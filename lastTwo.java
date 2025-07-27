public String lastTwo(String str) {
    String newString="";
    if (str.length()<2){
        newString += str;
    }else{
        char last2 = str.charAt(str.length()-2);
        char last1 = str.charAt(str.length()-1);
        String firstString = str.substring(0,str.length()-2);
        newString = firstString + last1 + last2;
    }return newString;
}
