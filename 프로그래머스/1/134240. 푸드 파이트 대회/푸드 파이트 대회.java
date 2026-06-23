class Solution {
    public String solution(int[] food) {
        String str = "";
        
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                str += i;
            }
        }
        
        String reverseStr = "";
        
        for(int i=0; i<str.length(); i++){
            reverseStr += str.charAt(str.length()-i-1);
        }
        
        return str + "0" + reverseStr;
    }
}