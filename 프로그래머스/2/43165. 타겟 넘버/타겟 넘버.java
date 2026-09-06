class Solution {
    int cnt = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, 0, target);
        return cnt;
    }
    
    private void dfs(int depth, int[] numbers, int sum, int target){
        if(depth == numbers.length){
            if(sum == target){
                cnt++;
            }
            return;
        }
        
        int number = numbers[depth];
        
        dfs(depth + 1, numbers, sum + number, target);
        dfs(depth + 1, numbers, sum - number, target);
        
    }
}