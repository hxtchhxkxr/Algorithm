import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            if(n%i == 0 && isPrime(i)){
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public static boolean isPrime(int n){
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                cnt++;
            }
        }
        
        return cnt == 2? true : false;
    }
}