import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length - 5];
        
        Arrays.sort(num_list);
        
        for(int i=0; i<result.length; i++){
            result[i] = num_list[i+5];
        }
        
        return result;
    }
}