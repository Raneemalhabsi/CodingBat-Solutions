public boolean lastDigit(int a, int b) {
    int lastA = a % 10;
    int lastB = b % 10;
    if (lastA == lastB){
        return true;
    }else{
        return false;
    }
}
