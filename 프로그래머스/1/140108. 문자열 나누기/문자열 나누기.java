class Solution {
    public int solution(String s) {
        int idx = 0;
        int cnt = 0;
        int len = s.length();
        
        while(idx<len){
            char x = s.charAt(idx);
            idx++;
            
            int cnt1 = 1;   // x의 개수
            int cnt2 = 0;   // x가 아닌 것의 개수
            
            while(idx < len && cnt1 != cnt2){
                if(s.charAt(idx) == x){
                    cnt1++;
                }
                else{
                    cnt2++;
                }
                idx++;
            }
            
            cnt++;
        }
        
        return cnt;
    }
}