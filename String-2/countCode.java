public int countCode(String str) {
    int counter=0;
    for (int i =0; i<=str.length()-4; i++){
        if (str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e'){
            counter +=1;
        }
    }return counter;
}