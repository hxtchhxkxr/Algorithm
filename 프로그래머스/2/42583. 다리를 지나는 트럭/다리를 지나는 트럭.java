import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> wait = new LinkedList<>();
        
        for(int i=0; i<bridge_length; i++){
            bridge.offer(0);
        }
        
        for(int truck_weight : truck_weights){
            wait.offer(truck_weight);
        }
        
        int sum = 0;
        int cnt = 0;

        while(!wait.isEmpty()){
            int out = bridge.poll();
            sum -= out;
            
            int truck = wait.peek();
            
            if(sum + truck <= weight){
                bridge.offer(truck);
                sum += truck;
                wait.poll();
            }
            else{
                bridge.offer(0);
            }
            
            cnt++;
        }
        
        return cnt + bridge_length;
    }
}