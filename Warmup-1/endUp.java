public String endUp(String str) {
    if (str.length()<=3){
        return str.toUpperCase();
    }if (str.length()>3){
        String firstPart = str.substring(0, str.length() - 3);
        String lastPart = str.substring(str.length() - 3);
        lastPart = lastPart.toUpperCase();
        return firstPart + lastPart;
    }return "invalid";
}
