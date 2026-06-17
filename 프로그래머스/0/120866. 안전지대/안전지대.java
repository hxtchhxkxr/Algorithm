class Solution {
    public int solution(int[][] board) {
        int[][] danger = new int[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                
                if(board[i][j] == 1){
                    danger[i][j] = 1;
                    
                    int[] dx = {-1,-1,-1, 0,0, 1,1,1};
                    int[] dy = {-1,0,1, -1,1, -1,0,1};
                    
                    for(int d=0; d<8; d++){
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        
                        if((nx >= 0 && nx < board.length) &&
                          ny >= 0 && ny < board[0].length){
                            danger[nx][ny] = 1;
                        }
                    }
                }
            }
        }
        
        int cnt = 0;
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(danger[i][j] == 0){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}