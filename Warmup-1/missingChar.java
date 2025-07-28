public class missingChar {
    public String missingChar(String str, int n) {
        String newString ="";
        for (int i=0; i <str.length(); i++){
            if (i != n){
                newString = newString + str.charAt(i);
            }
        }
        return newString;
    }
}
