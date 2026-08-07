class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length;
        
        int[][] maxSum = new int[h][h];
        
        maxSum[0][0] = triangle[0][0];
        
        for(int i=1; i<h; i++){
            for(int j=0; j<=i; j++){
                if(j == 0){
                    maxSum[i][j] = maxSum[i-1][j] + triangle[i][j];
                }
                else if(j == i){
                    maxSum[i][j] = maxSum[i-1][j-1] + triangle[i][j];
                }
                else{
                    int sum1 = maxSum[i-1][j] + triangle[i][j];
                    int sum2 = maxSum[i-1][j-1] + triangle[i][j];
                    
                    maxSum[i][j] = sum1 > sum2 ? sum1 : sum2;
                }
            }
        }
        
        int max = maxSum[h-1][0];
        
        for(int i=1; i<h; i++){
            max = max > maxSum[h-1][i] ? max : maxSum[h-1][i];
        }
        
        return max;
    }
}