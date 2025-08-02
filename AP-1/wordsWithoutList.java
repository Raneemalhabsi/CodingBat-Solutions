public List wordsWithoutList(String[] words, int len) {
    List<String> ArrayList = new ArrayList<String>();
    for (int i=0; i<words.length; i++){
        if (words[i].length() != len){
            ArrayList.add(words[i]);
        }
    }return ArrayList;
}
