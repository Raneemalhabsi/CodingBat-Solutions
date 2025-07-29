public String mixString(String a, String b) {
    String newStr = "";
    int min = Math.min(a.length(), b.length());
    for (int i=0; i<min; i++){
        newStr+= a.charAt(i);
        newStr += b.charAt(i);
    }if (a.length()>min){
        newStr += a.substring(min);
    }if (b.length()>min){
        newStr += b.substring(min);
    }
    return newStr;
}
