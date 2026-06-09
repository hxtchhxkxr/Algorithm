class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);
        int result = 0;
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            
            if(c == '3' || c == '6' || c == '9'){
                result++;
            }
        }
        
        return result;
    }
}