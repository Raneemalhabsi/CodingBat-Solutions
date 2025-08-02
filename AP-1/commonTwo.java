public int commonTwo(String[] a, String[] b) {
    int counter = 0;
    for (int i=0; i<a.length; i++){
        if (i>0 && a[i].equals(a[i-1])){
            continue;
        }
        for (int j=0; j<b.length; j++){
            if (a[i].equals(b[j])){
                counter += 1;
                break;
            }
        }
    }return counter;
}
