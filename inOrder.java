public boolean inOrder(int a, int b, int c, boolean bOk) {
    if (!bOk){
        if(b>a && c>b){
            return true;
        }return false;
    }if (bOk){
        if(c>b){
            return true;
        }
    }return false;
}
