public int start1(int[] a, int[] b) {
    int counter = 0;
    if (a.length>=1 && a[0]==1 ){
        counter+=1;
    }if(b.length>=1 && b[0]==1){
        counter +=1;
    }return counter;
}
