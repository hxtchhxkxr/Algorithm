class Solution {
    int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, 0, visited, dungeons);
        
        return max;
    }
    
    void dfs(int k, int cnt, boolean[] visited, int[][] dungeons){
        max = Math.max(max, cnt);
        
        for(int i=0; i<dungeons.length; i++){
            if(visited[i]) continue;
            
            if(k<dungeons[i][0]) continue;
            
            visited[i] = true;
            
            dfs(
                k-dungeons[i][1],
                cnt+1,
                visited,
                dungeons
            );
            
            visited[i] = false;
        }
    }
}