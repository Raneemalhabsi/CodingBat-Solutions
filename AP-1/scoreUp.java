public int scoreUp(String[] key, String[] answers) {
    int score =0;
    for (int i=0; i<answers.length; i++){
        if (answers[i] == key[i]){
            score +=4;
        }else if (answers[i].equals("?")){
            score +=0;
        }
        else if (answers[i] != key[i]){
            score -= 1;
        }
    }return score;
}
