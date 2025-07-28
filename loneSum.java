public int loneSum(int a, int b, int c) {
    int sum=0;
    if (a!=b && b!=c && a!=c){
        sum = a+b+c;
    }else if(a==b && a==c && b==c){
        sum = 0;
    }
    else if (a==b){
        sum = c;
    }else if (b==c){
        sum = a;
    }else if (a==c){
        sum = b;
    }return sum;
}
