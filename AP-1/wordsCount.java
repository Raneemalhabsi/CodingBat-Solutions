public int wordsCount(String[] words, int len) {
    int counter =0;
    for (int i=0; i<words.length; i++){
        if (len == words[i].length()){
            counter +=1;
        }
    }return counter;
}
