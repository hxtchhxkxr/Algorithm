class Solution {
    public int solution(int n) {
        int num = 1;
        
        while(n % num != 1){
            num++;
        }
        
        return num;
    }
}