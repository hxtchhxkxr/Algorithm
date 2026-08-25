class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];
        int len = arr1[0].length;
        
        for(int row = 0; row<arr1.length; row++){
            for(int col = 0; col<arr2[0].length; col++){
                int sum = 0;
                
                for(int i=0; i<len; i++){
                    sum += arr1[row][i] * arr2[i][col];
                }
                
                result[row][col] = sum;
            }
        }
        
        return result;
    }
}