import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = new Integer[numlist.length];
        
        for(int i=0; i<numlist.length; i++){
            arr[i] = numlist[i];
        }
        
        Arrays.sort(arr, (a,b) -> {
            int distA = Math.abs(a-n);
            int distB = Math.abs(b-n);
            
            if(distA == distB){
                return b-a;
            }
            
            return distA - distB;
        });
        
        int[] result = new int[numlist.length];
        
        for(int i=0; i<numlist.length; i++){
            result[i] = arr[i];
        }
        
        return result;
    }
}