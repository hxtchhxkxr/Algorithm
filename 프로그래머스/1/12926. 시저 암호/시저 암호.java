class Solution {
    public String solution(String s, int n) {
        String result = "";
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                result += c;
            }
            else if(Character.isUpperCase(c)){
                result += (char)((c - 'A' + n) % 26 + 'A');
            }
            else if(Character.isLowerCase(c)){
                result += (char)((c - 'a' + n) % 26 + 'a');
            }
        }
        
        return result;
    }
}