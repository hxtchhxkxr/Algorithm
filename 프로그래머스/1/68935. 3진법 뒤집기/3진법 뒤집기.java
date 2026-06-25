class Solution {
    public int solution(int n) {
        String ternary = "";
        
        while(n!=0){
            ternary += n%3;
            n /= 3;
        }
        
        int result = 0;
        
        for(int i=0; i<ternary.length(); i++){
            result = result*3 + (ternary.charAt(i) - '0');
        }
        
        return result;
    }
}