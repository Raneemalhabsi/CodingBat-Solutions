public int countHi2(String str) {
    if (str.length() < 2){
        return 0;
    }
    if (str.length() >= 3 && str.charAt(0)=='x' && str.charAt(1)=='h' && str.charAt(2)=='i'){
        return countHi2(str.substring(3));
    }else if (str.substring(0,2).equals("hi")) {
        return 1 + countHi2(str.substring(1));
    }else{
        return countHi2(str.substring(1));
    }
}
