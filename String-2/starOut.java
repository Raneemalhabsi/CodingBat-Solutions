public String starOut(String str) {
    String newStr = "";
    for (int i=0 ; i<str.length(); i++){
        if( str.charAt(i) == '*'){
            continue;
        }if( i>=1 && str.charAt(i-1) == '*'){
            continue;
        }if(i<str.length()-1 && str.charAt(i+1) == '*'){
            continue;
        }newStr += str.charAt(i);
    }return newStr;
}

