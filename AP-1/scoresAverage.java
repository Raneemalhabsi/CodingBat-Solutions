public int scoresAverage(int[] scores) {
    int middle = scores.length / 2;
    int firstHalf = average(scores, 0, middle);
    int secondHalf = average(scores, middle, scores.length);
    if (firstHalf > secondHalf){
        return firstHalf;
    }else{
        return secondHalf;
    }
}

public int average(int[] scores, int start, int end){
    int sum =0;
    for (int i=start; i<end; i++){
        sum += scores[i];
    }int avg = sum / (end-start);
    return avg;
}
