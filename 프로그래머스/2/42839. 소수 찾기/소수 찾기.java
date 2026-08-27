import java.util.*;

class Solution {
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, "", visited);
        
        boolean[] prime = new boolean[10000000];
        
        for(int i=2; i<= 9999999; i++){
            prime[i] = true;
        }
        
        prime[0] = false;
        prime[1] = false;
        
        for(int i=2; i*i<=9999999; i++){
            if(!prime[i]){
                continue;
            }
            
            for(int j=i*i; j<=9999999; j++){
                if(j % i == 0){
                    prime[j] = false;
                }
            }
        }
        
        int cnt = 0;
        
        for(int num : numberSet){
            if(prime[num]){
                cnt++;
            }
        }
        
        return cnt;
    }
    
    Set<Integer> numberSet = new HashSet<>();
    
    void dfs(String numbers, String current, boolean[] visited){
        if(!current.equals("")){
            numberSet.add(Integer.parseInt(current));
        }
            
        for(int i=0; i<numbers.length(); i++){
            if(visited[i]){
                continue;
            }
            
            visited[i] = true;
            
            dfs(
                numbers,
                current + numbers.charAt(i),
                visited
            );
            
            visited[i] = false;
        }
    }
}