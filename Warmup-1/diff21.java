public int diff21(int n) {
    int diff21;
    if (n>21){
        diff21 = n - 21;
        return diff21 * 2;
    }else{
        diff21 = 21 -n;
        return diff21;
    }
}