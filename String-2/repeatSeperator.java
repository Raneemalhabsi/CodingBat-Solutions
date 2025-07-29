public String repeatSeparator(String word, String sep, int count) {
    String newStr="";
    for (int i =0; i<count; i++){
        newStr+= word;
        if (i< count -1){
            newStr += sep;
        }
    }return newStr;
}
