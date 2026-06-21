class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        
        int[][] dir = {
            {0, 1},   // 오른쪽
            {1, 0},   // 아래
            {0, -1},  // 왼쪽
            {-1, 0}   // 위
        };
        
        int row = 0;
        int col = 0;
        int[] curDir = dir[0];
        int cnt = 1;
        
        while(cnt <= n*n){
            result[row][col] = cnt;
            
            int nextRow = row + curDir[0];
            int nextCol = col + curDir[1];
            
            if((nextRow < 0 || nextRow >= n) || 
               (nextCol < 0 || nextCol >= n) ||
                result[nextRow][nextCol] != 0){
  
                if(curDir == dir[0]) curDir = dir[1];
                else if(curDir == dir[1]) curDir = dir[2];
                else if(curDir == dir[2]) curDir = dir[3];
                else if(curDir == dir[3]) curDir = dir[0];
                
                nextRow = row + curDir[0];
                nextCol = col + curDir[1];
            }
            
            row = nextRow;
            col = nextCol;
            
            cnt++;
        }
        
        return result;
    }
}