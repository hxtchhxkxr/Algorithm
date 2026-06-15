class Solution {
    public int solution(int[] array) {
        int cnt = 0;
        
        for(int i=0; i<array.length; i++){
            int num = array[i];
            while(num != 0){
                if(num % 10 == 7){
                    cnt++;
                }
                num /= 10;
            }
        }
        
        return cnt;
    }
}