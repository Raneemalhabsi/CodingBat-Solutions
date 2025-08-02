public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] array = new String[n];
    int indexA =0;
    int indexB =0;
    for (int indexArray=0; indexArray <n; indexArray++){
        if (a[indexA].compareTo(b[indexB]) < 0){
            array[indexArray] = a[indexA];
            indexA += 1;
        }else if (a[indexA].compareTo(b[indexB]) > 0){
            array[indexArray] = b[indexB];
            indexB += 1;
        }else {
            array[indexArray] = a[indexA];
            indexA +=1;
            indexB +=1;
        }
    }return array;
}
