import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int cnt = 0;
        
        HashMap<Integer, Integer> front = new HashMap<>();
        HashMap<Integer, Integer> rear = new HashMap<>();
        
        for(int i=0; i<topping.length; i++){
            int t = topping[i];
            rear.put(t, rear.getOrDefault(t, 0) + 1);
        }
        
        for(int i=0; i<topping.length-1; i++){
            int t = topping[i];
            
            front.put(t, front.getOrDefault(t, 0) + 1);
            rear.put(t, rear.get(t) - 1);
            
            if(rear.get(t) == 0){
                rear.remove(t);
            }
            
            if(front.size() == rear.size()){
                cnt++;
            }
        }
        
        return cnt;
    }
}