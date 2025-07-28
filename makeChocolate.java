public int makeChocolate(int small, int big, int goal) {
    int bigMax = Math.min(big, goal/5);
    int smallBar = goal - (bigMax*5);
    if (smallBar<=small){
        return smallBar;
    }else {
        return -1;
    }
}
