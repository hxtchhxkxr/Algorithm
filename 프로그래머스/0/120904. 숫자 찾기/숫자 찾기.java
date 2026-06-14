class Solution {
    public int solution(int num, int k) {
        int result = -1;
        int idx = 0;
        
        while(num != 0){
            idx++;
            
            if(num % 10 == k){
                result = idx;
            }
            num /= 10;
        }
        
        return result != -1 ? idx - result + 1 : -1;
    }
}