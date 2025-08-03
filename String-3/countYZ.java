public int countYZ(String str) {
    int counter = 0;
    str= str.toLowerCase();
    for (int i=0; i<str.length(); i++){
        if (str.charAt(i) == 'y' || str.charAt(i) == 'z'){
            if (i == str.length()-1){
                counter +=1;
            }else{
                if (!Character.isLetter(str.charAt(i+1))){
                    counter +=1;
                }
            }
        }
    }return counter;
}
