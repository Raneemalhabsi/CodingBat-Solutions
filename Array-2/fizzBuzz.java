public String[] fizzBuzz(int start, int end) {
    String[] array = new String[end - start];
    for (int i = start; i<end; i++){
        int index = i - start;
        if (i % 3 == 0 && i % 5 == 0){
            array[index] = "FizzBuzz";
        }else if (i % 3 == 0){
            array[index]= "Fizz";
        }else if (i % 5 ==0){
            array[index] = "Buzz";
        }else{
            array[index]= String.valueOf(i);
        }
    }return array;
}


