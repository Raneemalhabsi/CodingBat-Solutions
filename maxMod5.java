public int maxMod5(int a, int b) {
    int aRemainder = a%5;
    int bRemainder = b%5;
    if (a==b){
        return 0;
    }else if(aRemainder != bRemainder){
        return Math.max(a,b);
    }else{
        return Math.min(a,b);
    }
}
