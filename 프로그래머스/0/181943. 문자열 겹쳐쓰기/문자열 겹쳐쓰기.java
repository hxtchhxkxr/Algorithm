class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int osLen = overwrite_string.length();
        
        for(int i=0; i<my_string.length(); i++){
            if(i < s || i >= s+osLen){
                answer += my_string.charAt(i);
            }
            else {
                answer += overwrite_string.charAt(i - s);
            }
        }
        
        
        return answer;
    }
}