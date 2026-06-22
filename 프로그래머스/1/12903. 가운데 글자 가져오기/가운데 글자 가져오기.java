class Solution {
    public String solution(String s) {
        int len = s.length();
        
        if(len % 2 != 0){
            return String.valueOf(s.charAt(len/2));
        }
        else{
            return String.valueOf(s.charAt(len/2 - 1)) + 
                   String.valueOf(s.charAt(len/2));
        } 
    }
}