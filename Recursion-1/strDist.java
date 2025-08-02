public int strDist(String str, String sub) {
    if (sub.length() > str.length()){
        return 0;
    }if (!str.substring(0, sub.length() ).equals(sub) ){
        return strDist(str.substring(1), sub);
    }if (!str.substring(str.length() - sub.length() ).equals(sub) ){
        return strDist(str.substring(0, str.length()-1), sub);
    }else {
        return str.length();
    }
}
