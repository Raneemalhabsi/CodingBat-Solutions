public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
}
public int round10(int n){
    int remainder = n%10;
    if (remainder>=5){
        return n + (10-remainder);
    }else{
        return n - remainder;
    }
}
