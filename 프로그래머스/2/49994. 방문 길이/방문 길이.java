class Solution {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;
        
        boolean[][][][] visited = new boolean[11][11][11][11];
        
        int cnt = 0;
        
        for(char dir : dirs.toCharArray()){
            int nx = x;
            int ny = y;
            
            if(dir == 'U'){
                ny++;
            }
            else if(dir == 'D'){
                ny--;
            }
            else if(dir == 'R'){
                nx++;
            }
            else if(dir == 'L'){
                nx--;
            }
            
            if(nx < -5 || nx > 5 || ny < -5 || ny > 5){
                continue;
            }
            
            if(!visited[x + 5][y + 5][nx + 5][ny + 5]){
                cnt++;
                
                visited[x + 5][y + 5][nx + 5][ny + 5] = true;
                visited[nx + 5][ny + 5][x + 5][y + 5] = true;
            }
            
            x = nx;
            y = ny;
        }
        
        return cnt;
    }
}