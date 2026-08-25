class Solution {
    public int solution(int[] citations) {
        int h = 0;
        int cnt;
        
        do{
            cnt = 0;
            
            for(int i=0; i<citations.length; i++){
                if (citations[i] >= h){
                    cnt++;
                }
            }
            
            h++;
        } while(h-1<=cnt);
        
        return h-2;
    }
}