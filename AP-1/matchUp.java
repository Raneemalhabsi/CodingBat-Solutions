public int matchUp(String[] a, String[] b) {
    int counter = 0;
    for (int i=0; i<a.length; i++){
        if (a[i].length() >=1 && b[i].length() >=1){
            if ( a[i].charAt(0)== b[i].charAt(0)){
                counter +=1;
            }
        }
    }return counter;
}
