public String withoutString(String base, String remove) {
    String newString="";
    String lowerBase = base.toLowerCase();
    String lowerRemove = remove.toLowerCase();
    int i=0;
    while (i<base.length()){
        if (i + remove.length() <= base.length() && lowerBase.substring(i, i+remove.length() ).equals(lowerRemove)){
            i += remove.length();
        }else{
            newString += base.charAt(i);
            i=i+1;
        }
    }return newString;
}
