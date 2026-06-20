import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);
        
        int idx = 0;
        
        for(int num : arr){
            boolean isExist = false;
            
            for(int i=0; i<idx; i++){
                if(result[i] == num){
                    isExist = true;
                    break;
                }
            }
            
            if(!isExist){
                result[idx] = num;
                idx++;
                
                if(idx == k){
                    break;
                }
            }
        }
        
        return result;
    }
}