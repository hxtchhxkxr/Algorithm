import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> keyCnt = new HashMap<>();
        
        for(char c='A'; c<='Z'; c++){
            keyCnt.put(c, -1);
        }
        
        for(String key : keymap){
            for(int i=0; i<key.length(); i++){
                char c = key.charAt(i);
                
                if(keyCnt.get(c) == -1 || keyCnt.get(c) > i+1){
                    keyCnt.put(c, i+1);
                }
            }
        }
        
        int[] result = new int[targets.length];
        
        for(int i=0; i<targets.length ;i++){
            int sum = 0;
            
            for(int j=0; j<targets[i].length(); j++){
                char t = targets[i].charAt(j);
                
                if(keyCnt.get(t) == -1){
                    sum = -1;
                    break;
                }
                
                sum += keyCnt.get(t);
            }
            
            result[i] = sum;
        }
        
        return result;
    }
}