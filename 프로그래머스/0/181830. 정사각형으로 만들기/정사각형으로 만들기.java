class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;     // 행
        int col = arr[0].length;    // 열
        
        if(row > col){
            int[][] result = new int[row][row];
            
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    result[i][j] = arr[i][j];
                }
            }
            
            return result;
        }
        else{
            int[][] result = new int[col][col];
            
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    result[i][j] = arr[i][j];
                }
            }
            
            return result;
        }
    }
}