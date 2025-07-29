public boolean prefixAgain(String str, int n) {
    for (int i=1 ; i<=str.length()-n; i++){
        if(str.substring(i,i+n).equals(str.substring(0,n))){
            return true;
        }
    }return false;
}
