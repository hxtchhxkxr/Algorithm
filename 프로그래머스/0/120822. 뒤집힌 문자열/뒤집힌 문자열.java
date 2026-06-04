class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        
        String answer = "";
        
        for(int i = 0; i<len; i++){
            answer += my_string.charAt(len - i -1);
        }
        
        return answer;
    }
}