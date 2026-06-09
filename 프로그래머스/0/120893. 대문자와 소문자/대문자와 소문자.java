class Solution {
    public String solution(String my_string) {
        String result = "";
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(c >= 'a' && c <= 'z'){
                result += (char)(c - 32);
            }
            else if(c >= 'A' && c <= 'Z'){
                result += (char)(c + 32);
            }
        }
        
        return result;
    }
}