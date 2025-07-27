public int redTicket(int a, int b, int c) {
    int result;
    if (a==2 && b==2 && c==2){
        result = 10;
    }else if(a==b && b==c){
        result = 5;
    }else if(a==b && a!=c || a==c && b!=a){
        result = 0;
    }else {
        result = 1;
    }return result;
}
