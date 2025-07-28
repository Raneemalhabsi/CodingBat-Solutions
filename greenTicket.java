public int greenTicket(int a, int b, int c) {
    int result;
    if(a==b && b==c){
        result = 20;
    }else if(a!=b && b!=c && a!=c){
        result = 0;
    }else{
        result=10;
    }return result;
}
