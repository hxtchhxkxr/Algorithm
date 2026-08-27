import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
            q.add(i);
        }
        
        int order = 0;
        
        while(!q.isEmpty()){
            int idx = q.poll();
            
            if(priorities[idx] == pq.peek()){
                pq.poll();
                order++;
                
                if(idx == location){
                    return order;
                }
            }
            else{
                q.add(idx);
            }
        }
        
        return 0;
    }
}