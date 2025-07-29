public String wordEnds(String str, String word) {
    String newStr="";
    for (int i =0; i<str.length(); i++){
        if (i<=str.length() - word.length()){
            String sub = str.substring(i, i+word.length());
            if (sub.equals(word)){
                if (i >= 1){
                    newStr += str.charAt(i-1);
                }if (i+word.length() < str.length()){
                    newStr+= str.charAt(i+word.length());
                }
            }
        }
    }return newStr;
}
