class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] scoreSum = new int[len];
        
        for(int i=0; i<len; i++){
            int sum = score[i][0] + score[i][1];
            scoreSum[i] = sum;
        }
        
        int[] result = new int[len];
        
        for(int i=0; i<len; i++){
            int cnt = 0;
            for(int j=0; j<len; j++){
                if(scoreSum[j]>scoreSum[i]){
                    cnt++;
                }
            }
            result[i] = cnt+1;
        }
        
        return result;
    }
}