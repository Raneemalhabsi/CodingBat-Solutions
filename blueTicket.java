public int blueTicket(int a, int b, int c) {
    int result;
    int sumAb = a+b;
    int sumBc = b+c;
    int sumAc = a+c;
    if (sumAb==10 || sumBc==10 || sumAc==10){
        result = 10;
    }else if(sumAb - sumBc == 10 || sumAb - sumAc == 10){
        result = 5;
    }else {
        result =0;
    }return result;
}
