public String[] wordsWithout(String[] words, String target) {
    int counter =0;
    for (int i=0; i<words.length; i++){
        if (!words[i].equals(target)){
            counter += 1;
        }
    }
    String[] array = new String[counter];
    int indexArray= 0;
    for (int i=0; i<words.length; i++){
        if (!words[i].equals(target)){
            array[indexArray] = words[i];
            indexArray+=1;
        }
    }return array;
}

