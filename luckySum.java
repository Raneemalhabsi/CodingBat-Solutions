public int luckySum(int a, int b, int c) {
    int sum=0;
    if (a!=13 && b!=13 && c!=13){
        sum = a+b+c;
    }else if(a==13){
        sum = 0;
    }else if(b==13){
        sum = a;
    }else if (c==13){
        sum = a+b;
    }return sum;
}
