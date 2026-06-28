class Solution {
    public String solution(String s) {
        String result = "";
        boolean isFirst = true;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(isFirst){
                if(!Character.isDigit(c)){
                    result += Character.toUpperCase(c);
                }
                else{
                    result += c;
                }
            }
            else{
                result += Character.toLowerCase(c);
            }
            
            isFirst = c == ' ' ? true : false;
        }
        
        return result;
    }
}