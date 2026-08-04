class Solution {
    public int solution(int n) {
        int cnt = 0;
        
        for(int st = 1; st<=n; st++){
            int sum = 0;
            
            for(int en = st; en<=n; en++){
                sum+=en;
                
                if(sum == n){
                    cnt++;
                    break;
                }
                
                if(sum > n){
                    break;
                }
            }
        }
        
        return cnt;
    }
}