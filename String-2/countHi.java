public int countHi(String str) {
    int counter = 0;
    if (str.length()>=2){
        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                counter +=1;
            }
        }
    }return counter;
}
