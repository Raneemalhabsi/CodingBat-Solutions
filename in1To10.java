public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode){
        if (n<=1 || n>=10){
            return true;
        }
    }if (!outsideMode){
        if (n>=1 && n<=10){
            return true;
        }
    }return false;
}
