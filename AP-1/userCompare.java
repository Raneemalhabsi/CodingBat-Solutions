public int userCompare(String aName, int aId, String bName, int bId) {
    int result =0;
    if (aName.compareTo(bName) < 0){
        result = -1;
    }else if (aName.compareTo(bName) > 0){
        result = 1;
    }else{
        if (aId < bId){
            result = -1;
        }else if (aId > bId){
            result = 1;
        }else if (bId == aId){
            result = 0;
        }
    }return result;
}
