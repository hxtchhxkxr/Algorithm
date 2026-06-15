class Solution {
    public int solution(String myString, String pat) {
        String convertString = "";
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                convertString += "B";
            }
            else if(myString.charAt(i) == 'B'){
                convertString += "A";
            }
        }
        
        return convertString.contains(pat) ? 1 : 0;
    }
}