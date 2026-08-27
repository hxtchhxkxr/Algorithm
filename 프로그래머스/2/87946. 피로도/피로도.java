class Solution {
    int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, 0, visited, dungeons);
        
        return max;
    }
    
    // 현재 피로도, 탐험한 던전 수, visited, dungeons
    void dfs(int current, int cnt, boolean[] visited, int[][] dungeons){
        max = Math.max(max, cnt);
        
        for(int i=0; i<dungeons.length; i++){
            if (visited[i] == true){
                continue;
            }
            
            if(current < dungeons[i][1]){
                continue;
            }
            
            visited[i] = true;
            
            dfs(
                current - dungeons[i][0],
                cnt+1,
                visited,
                dungeons
            );
            
            visited[i] = false;
        }
    }
}