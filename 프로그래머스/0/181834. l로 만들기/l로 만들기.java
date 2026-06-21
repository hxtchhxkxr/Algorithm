class Solution {
    public String solution(String myString) {
        String result = "";
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) < 'l'){
                result += 'l';
            }
            else{
                result += myString.charAt(i);
            }
        }
        
        return result;
    }
}