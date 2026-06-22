class Solution {
    public long solution(long n) {
        long sqrt = 1;
        
        while(sqrt * sqrt <= n){
            sqrt++;
        }
        
        if((sqrt - 1) * (sqrt - 1) == n){
            return sqrt * sqrt;
        }
        
        return -1;
    }
}