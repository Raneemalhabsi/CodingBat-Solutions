public int maxBlock(String str) {
    if (str.length() == 0){
        return 0;
    }int max = 1;
    int current =1;
    for (int i=1; i<str.length(); i++){
        if(str.charAt(i) == str.charAt(i-1)){
            current +=1;
        }else{
            current = 1;
        }if (current > max){
            max = current;
        }
    }return max;
}
