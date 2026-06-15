class Solution {
    public int[] solution(String myString) {
        int len = 0;
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                len++;
            }
        }
        
        int[] result = new int[len+1];
        
        int idx = 0;
        int cnt = 0;
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                result[idx] = cnt;
                idx++;
                cnt = 0;
            }
            else{
                cnt++;
            }
        }
        
        result[idx] = cnt;
        
        return result;
    }
}