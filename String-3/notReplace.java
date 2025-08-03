public String notReplace(String str) {
    String newString = "";
    int i=0;
    while(i<str.length()){
        if(i+1 < str.length() && str.substring(i, i+2).equals("is")){
            if ((i==0 || !Character.isLetter(str.charAt(i-1))) && (i + 2 >= str.length() || !Character.isLetter(str.charAt(i + 2)))) {
                newString += "is not";
                i+=2;
                continue;
            }
        }newString += str.charAt(i);
        i+=1;
    }return newString;
}
