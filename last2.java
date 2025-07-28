public int last2(String str) {
    if (str.length()<2){
        return 0;
    }else {
        String last2 = str.substring(str.length()-2);
        int counter = 0;
        for (int i=0; i<str.length()-2; i++){
            String newString= str.substring(i,i+2);
            if(newString.equals(last2)){
                counter+=1;
            }
        }return counter;
    }
}
