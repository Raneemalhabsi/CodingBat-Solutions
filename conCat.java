public String conCat(String a, String b) {
    String newString="";
    if (a.length()>=1 && b.length()>=1 && a.charAt(a.length()-1) == b.charAt(0)){
        newString = a + b.substring(1);
    }else{
        newString = a+b;
    }return newString;
}
