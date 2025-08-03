public int sumNumbers(String str) {
    String num="";
    int sum=0;

    for (int i=0; i<str.length(); i++){
        if (Character.isDigit(str.charAt(i))){
            num += str.charAt(i);
        }else{
            if (num.length() !=0 ){
                sum += Integer.parseInt(num);
                num = "";
            }
        }
    }if (num.length() != 0){
        sum += Integer.parseInt(num);
    }return sum;
}
