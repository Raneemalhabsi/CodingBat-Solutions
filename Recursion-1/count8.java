public int count8(int n) {
    int counter =0;
    if (n==0){
        return 0;
    }else if (n%10 == 8){
        if((n/10) % 10 ==8){
            return 2 + count8(n/10);
        }else{
            return 1 + count8(n/10);
        }
    }else{
        return count8(n/10);
    }
}
