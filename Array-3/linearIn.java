public boolean linearIn(int[] outer, int[] inner) {
    int innerPointer = 0;
    for (int i = 0; i<outer.length; i++){
        if (innerPointer < inner.length && outer[i] == inner[innerPointer]){
            innerPointer +=1;
        }
    }if (innerPointer == inner.length){
        return true;
    }else{
        return false;
    }
}
