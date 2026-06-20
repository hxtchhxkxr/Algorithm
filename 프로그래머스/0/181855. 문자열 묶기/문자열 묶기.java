import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for(String str : strArr){
            int len = str.length();
            
            if(map.containsKey(len)){
                map.put(len, map.get(len) + 1);
            }
            else{
                map.put(len, 1);
            }
            
            result = Math.max(result, map.get(len));
        }
        
        return result;
    }
}