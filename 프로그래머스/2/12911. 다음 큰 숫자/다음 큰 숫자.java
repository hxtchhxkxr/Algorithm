class Solution {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);
        
        int result = n+1;
        
        while(Integer.bitCount(result) != cnt){
            result++;
        }
        
        return result;
    }
}