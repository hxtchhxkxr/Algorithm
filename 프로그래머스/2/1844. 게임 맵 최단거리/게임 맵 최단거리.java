import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] distance = new int[n][m];
        
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{0,0});
        distance[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            
            int r = cur[0];
            int c = cur[1];
            
            for(int i=0; i<4; i++){
                int nr = r+dr[i];
                int nc = c+dc[i];
                
                // 맵 범위를 벗어나는 경우
                if(nr < 0 || nr >= n || nc < 0 || nc >= m){
                    continue;
                }
                
                // 벽인 걍우
                if(maps[nr][nc] == 0){
                    continue;
                }
                
                // 이미 방문한 경우
                if(distance[nr][nc] != 0){
                    continue;
                }
                
                distance[nr][nc] = distance[r][c] + 1;
                
                queue.add(new int[]{nr, nc});
            }
        }
        
        return distance[n-1][m-1] == 0 ? -1 : distance[n-1][m-1];
    }
}