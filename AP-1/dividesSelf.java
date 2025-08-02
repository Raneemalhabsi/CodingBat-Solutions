public boolean dividesSelf(int n) {
    int copyN = n;
    while (n>0){
        if (n%10 == 0 || copyN % (n%10) != 0){
            return false;
        }n /= 10;
    }return true;
}
