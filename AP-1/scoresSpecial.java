public int scoresSpecial(int[] a, int[] b) {
    int sum = largestSpecialScore(a) + largestSpecialScore(b);
    return sum;
}
public int largestSpecialScore(int[] a){
    int max = 0;
    for (int i=0; i<a.length; i++){
        if (a[i] % 10 == 0 && a[i] > max){
            max = a[i];
        }
    }return max;
}
