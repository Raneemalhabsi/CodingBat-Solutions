public String getSandwich(String str) {
    int indexBread1 = -1;
    int indexBread2 = -1;
    for (int i=0; i<=str.length() -5; i++){
        String sub = str.substring(i,i+5);
        if (sub.equals("bread")){
            if (indexBread1 == -1 ){
                indexBread1 = i;
            }else{
                indexBread2 = i;
            }
        }
    }if (indexBread1 != -1 && indexBread2 != -1){
        return str.substring(indexBread1 +5, indexBread2);
    }else{
        return "";
    }
}