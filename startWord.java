public String startWord(String str, String word) {
    String newString = "";
    if (word.length()<=str.length()){
        String wordCheck = word.substring(1);
        String strCheck = str.substring(1, word.length());
        if (strCheck.equals(wordCheck)){
            newString = str.substring(0,word.length());
        }else{
            newString = "";
        }
    }return newString;
}
