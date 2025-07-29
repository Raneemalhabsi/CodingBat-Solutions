public boolean xyzMiddle(String str) {
    for (int i=0; i<=str.length()-3; i++){
        String sub = str.substring(i,i+3);
        if (sub.equals("xyz")){
            int leftSide = i;
            int rightSide = str.length() - (i+3);
            if (Math.abs(leftSide - rightSide) <=1){
                return true;
            }
        }
    }return false;
}
