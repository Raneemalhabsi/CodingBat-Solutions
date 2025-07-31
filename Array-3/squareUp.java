public int[] squareUp(int n) {
    int[] array = new int[n*n];
    for (int i = 1; i<=n; i++){
        for (int j=0; j<i; j++){
            array[i*n -j -1] = j+1;
        }
    }return array;
}
