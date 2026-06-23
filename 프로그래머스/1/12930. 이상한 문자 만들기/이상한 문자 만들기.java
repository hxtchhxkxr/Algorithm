class Solution {
    public String solution(String s) {
        String result = "";
        int idx = 0;
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                result += ' ';
                idx = 0;
                continue;
            }
            
            if(idx %2 == 0){
                result += Character.toUpperCase(c);
                idx++;
            }
            else{
                result += Character.toLowerCase(c);
                idx++;
            }
        }
        
        return result;
    }
}