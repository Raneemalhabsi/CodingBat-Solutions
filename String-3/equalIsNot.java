public boolean equalIsNot(String str) {
    int isCounter = 0;
    int notCounter = 0;
    for (int i=0; i<str.length(); i++){
        if (i+1< str.length() && str.substring(i,i+2).equals("is")){
            isCounter +=1;
        }else if(i+2 < str.length() && str.substring(i,i+3).equals("not")){
            notCounter += 1;
        }
    }if (isCounter == notCounter){
        return true;
    }else{
        return false;
    }
}
