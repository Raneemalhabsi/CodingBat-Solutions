public String middleTwo(String str) {
    int middle = str.length()/2;
    String newString = str.substring(middle -1 , middle +1);
    return newString;
}
