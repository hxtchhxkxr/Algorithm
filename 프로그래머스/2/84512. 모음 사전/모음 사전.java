class Solution {
    public int solution(String word) {
        dfs("", 0, word);
        return cnt;
    }
    
    char[] alps = {'A', 'E', 'I', 'O', 'U'};
    int cnt = 0;
    boolean isFound = false;
    
    private void dfs(String cur, int depth, String word){
        if(cur.equals(word)){
            isFound = true;
            return;
        }
        
        if(depth == 5){
            return;
        }
        
        for(int i=0; i<5; i++){
            if(isFound){
                return;
            }
            
            cnt ++;
            dfs(cur + alps[i], depth + 1, word);
        }
    }
}