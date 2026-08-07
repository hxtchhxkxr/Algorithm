import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        int len = elements.length;
        
        for(int cnt=1; cnt<=len; cnt++){
            for(int i=0; i<len; i++){
                int sum = 0;
                
                for(int j=0; j<cnt; j++){
                    sum += elements[(i+j)%len];
                }
                
                set.add(sum);
            }
        }
        
        return set.size();
    }
}