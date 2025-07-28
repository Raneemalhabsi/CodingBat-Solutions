public String fizzString2(int n) {
    String newString="";
    if (n%3==0 && n%5==0){
        newString = "FizzBuzz!";
    }else if(n%3==0){
        newString = "Fizz!";
    }else if(n%5==0){
        newString = "Buzz!";
    }else if (n%3!=0 && n%5!=0){
        newString = n + "!";
    }return newString;
}
