class Solution {
    public int solution(int chicken) {
        int cnt = 0;
        int coupon = chicken;
        
        while(coupon >= 10){
            int service = coupon / 10;
            
            cnt += service;
            
            int remain = coupon % 10;
            
            coupon = service + remain;
        }
        
        return cnt;
    }
}