class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1001];
        
        for(int i=0; i<array.length; i++){
            cnt[array[i]]++;
        }
        
        int max = 0;  
        
        for(int i=0; i<=1000; i++){
            if(cnt[i]>max){
                max = cnt[i];
            }
        }
        
        int maxCnt = 0;
        int answer = 0;
        
        for(int i=0; i<=1000;i++){
            if(cnt[i]==max){
                answer = i;
                maxCnt++;
            }
        }
        
        return maxCnt == 1 ? answer : -1;
    }
}