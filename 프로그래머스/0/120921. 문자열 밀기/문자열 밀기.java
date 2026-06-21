class Solution {
    public int solution(String A, String B) {
        boolean isPossible = false;
        int cnt = 0;
        
        if(A.equals(B)){
            return 0;
        }
        
        for(int i=0; i<A.length(); i++){
            A = push(A);
            cnt++;
            
            if(A.equals(B)){
                isPossible = true;
                break;
            }
        }
        
        return isPossible ? cnt : -1;
    }
    
    public String push(String str){
        String result = "";
        
        result += str.charAt(str.length() - 1);
        
        for(int i=0; i<str.length()-1; i++){
            result += str.charAt(i);
        }
        
        return result;
    }
}