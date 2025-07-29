public boolean endOther(String a, String b) {
    String newA = a.toLowerCase();
    String newB = b.toLowerCase();
    if (a.length() < b.length()){
        String endB = newB.substring(b.length() - a.length());
        if (endB.equals(newA)){
            return true;
        }else{
            return false;
        }
    }else if (b.length() <= a.length()){
        String endA = newA.substring(a.length() - b.length());
        if (endA.equals(newB)){
            return true;
        }else{
            return false;
        }
    }return false;
}
