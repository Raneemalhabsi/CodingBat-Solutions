public String fizzString(String str) {
    String newString="";
    if (str.charAt(0)=='f' && str.charAt(str.length()-1)=='b'){
        newString = "FizzBuzz";
    }
    else if (str.charAt(str.length()-1)=='b'){
        newString = "Buzz";
    }else if (str.charAt(0)=='f'){
        newString = "Fizz";
    }else{
        return str;
    }
    return newString;
}
