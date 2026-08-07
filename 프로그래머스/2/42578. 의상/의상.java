import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int result = 1;
        
        for(Integer value : map.values()){
            result *= (value + 1);
        }
        
        return result - 1;
    }
}