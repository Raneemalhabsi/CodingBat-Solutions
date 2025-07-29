public boolean catDog(String str) {
    int counterCat=0;
    int counterDog=0;
    for (int i = 0; i<=str.length()-3; i++){
        String subStr = str.substring(i, i+3);
        if (subStr.equals("cat")){
            counterCat +=1;
        }if (subStr.equals("dog")){
            counterDog +=1;
        }
    }if (counterCat == counterDog){
        return true;
    }else{
        return false;
    }
}