public int sumHeights2(int[] heights, int start, int end) {
    int sum=0;
    for (int i=start; i<end; i++){
        int changes = heights[i+1] - heights[i];
        if (changes >=1 ){
            sum += changes * 2;
        }else{
            sum += Math.abs(changes);
        }
    }return sum;
}
