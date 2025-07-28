public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    int sum=0;
    if(noDoubles && die1 == die2){
        if (die1 == 6){
            die1 = 1;
        }else{
            die1+=1;
        }
    }
    return sum=die1 + die2;
}
