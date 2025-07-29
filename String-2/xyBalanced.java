public boolean xyBalance(String str) {
    boolean xybalanced = true;
    for (int i=0; i<str.length(); i++){
        if (str.charAt(i)=='x'){
            xybalanced = false;
        }if(str.charAt(i)=='y'){
            xybalanced = true;
        }
    }return xybalanced;
}
