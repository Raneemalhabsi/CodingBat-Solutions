public String plusOut(String str, String word) {
    String newStr="";
    for (int i = 0; i<str.length(); i++){
        if(i<= str.length() - word.length()){
            String sub = str.substring(i, i + word.length());
            if (sub.equals(word)){
                newStr += word;
                i+= word.length() - 1;
            }else{
                newStr += '+';
            }
        }else {
            newStr += '+';
        }
    }return newStr;
}
