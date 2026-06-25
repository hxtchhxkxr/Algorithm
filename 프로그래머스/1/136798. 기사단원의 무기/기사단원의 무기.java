class Solution {
    public int solution(int number, int limit, int power) {
        // 1~number 약수의 개수를 담은 배열
        int[] divisorCnt = new int[number];
        
        for(int i=0; i<number; i++){
            int num = i+1;
            int cnt = 0;
            
            for(int j=1; j<=num; j++){
                if(num % j == 0){
                    cnt++;
                }
            }
            
            divisorCnt[i] = cnt;
        }
        
        // 만약 divisorCnt의 원소가 limit보다 크면 power으로 바꾸기
        // divisorCnt의 원소의 총합 구해서 return하기
        int sum = 0;
        
        for(int i=0; i<divisorCnt.length; i++){
            if(divisorCnt[i] > limit){
                divisorCnt[i] = power;
            }
            sum += divisorCnt[i];
        }
        
        return sum;
    }
}