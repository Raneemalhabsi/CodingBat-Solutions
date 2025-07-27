public String left2(String str) {
    String first2 = str.substring(0,2);
    String restString = str.substring(2);
    return restString + first2;

}
