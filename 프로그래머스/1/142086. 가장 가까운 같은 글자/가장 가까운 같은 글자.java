class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        
        result[0] = -1;
        
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            
            int idx = 0;
            
            for(int j=i-1; j>=0; j--){
                idx++;
                
                if(s.charAt(j) == c){
                    result[i] = idx;
                    break;
                }
                
                if(j == 0 && s.charAt(j) != c){
                    result[i] = -1;
                }
            }
        }
        
        return result;
    }
}