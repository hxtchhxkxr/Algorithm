class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        
        for(int i=0; i<n; i++){
            int[] arr = new int[n];
            arr[i] = 1;
            result[i] = arr;
        }
        
        return result;
    }
}