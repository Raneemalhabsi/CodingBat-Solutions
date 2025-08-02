public boolean strCopies(String str, String sub, int n) {
    if (n<=0){
        return true;
    }
    if (sub.length() > str.length() ){
        return false;
    }
    if (str.substring(0, sub.length()).equals(sub)) {
        return strCopies(str.substring(1), sub, n-1 );
    }else {
        return strCopies(str.substring(1), sub, n );
    }
}