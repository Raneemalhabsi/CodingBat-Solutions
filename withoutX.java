public String withoutX(String str) {
    String newString = str;
    if (str.length() > 0 && str.charAt(0) == 'x') {
        newString = newString.substring(1);
    }
    if (newString.length() > 0 && newString.charAt(newString.length() - 1) == 'x') {
        newString = newString.substring(0, newString.length() - 1);
    }
    return newString;
}
