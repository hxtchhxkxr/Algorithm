import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        
        for(int i=0; i<10; i++){
            String key = discount[i];
            
            if(map.containsKey(key)){
                map.put(key, map.get(key) - 1);
            }
        }
        
        int cnt = 0;
        
        if(isEmpty(map)){
            cnt++;
        }
        
        for(int i=0; i<discount.length - 10; i++){
            String out = discount[i];
            String in = discount[i + 10];
            
            if(map.containsKey(out)){
                map.put(out, map.get(out) + 1);
            }
            
            if(map.containsKey(in)){
                map.put(in, map.get(in) - 1);
            }
            
            if(isEmpty(map)){
                cnt++;
            }
        }
        
        return cnt;
    }
    
    private boolean isEmpty(HashMap<String, Integer> map){
        boolean allZero = true;
        
        for(int value : map.values()){
            if(value != 0){
                allZero = false;
                break;
            }
        }
        
        return allZero;
    }
}