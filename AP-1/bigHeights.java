public int bigHeights(int[] heights, int start, int end) {
    int counter=0;
    for (int i=start; i<end; i++){
        int step = Math.abs(heights[i+1] - heights[i]);
        if (step >= 5 ){
            counter +=1;
        }
    }return counter;
}
