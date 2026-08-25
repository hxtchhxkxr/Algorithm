import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len  = progresses.length;
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<len; i++){
            int day = 1;
            
            while(progresses[i] + speeds[i] * day <= 100){
                day++;
            }
            
            day = progresses[i] + speeds[i] * (day - 1) == 100 ? day - 1 : day;
            s.push(day);
        }
        
        Stack<Integer> complete = new Stack<>();
        
        while(!s.isEmpty()){
            complete.push(s.pop());
        }
        
        ArrayList<Integer> release = new ArrayList<>();
        
        while(!complete.isEmpty()){
            int cur = complete.pop();
            int cnt = 1;
            
            while(!complete.isEmpty() && cur >= complete.peek()){
                complete.pop();
                cnt++;
            }
            
            release.add(cnt);
        }
        
        int[] result = new int[release.size()];
        
        for(int i=0; i<release.size(); i++){
            result[i] = release.get(i);
        }
        
        return result;
    }
}