class Solution {
    public String solution(String my_string, int s, int e) {
        String str = "";
        
        for(int i=0; i<s; i++){
            str += my_string.charAt(i);
        }
        
        for(int i=s; i<=e; i++){
            str += my_string.charAt(s+e-i);
        }
        
        for(int i=e+1; i<my_string.length(); i++){
            str += my_string.charAt(i);
        }
        
        return str;
    }
}