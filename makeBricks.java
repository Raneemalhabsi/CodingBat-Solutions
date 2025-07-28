public boolean makeBricks(int small, int big, int goal) {
    int bigMax = Math.min(big , goal/5);
    int smallNeeded = (goal - bigMax*5);
    if (smallNeeded <= small){
        return true;
    }else{
        return false;
    }
}
