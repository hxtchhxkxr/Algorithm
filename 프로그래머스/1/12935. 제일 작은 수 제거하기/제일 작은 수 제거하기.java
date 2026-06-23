import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[] {-1};
        }
        
        int min = arr[0];
        int idx = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(idx != i){
                list.add(arr[i]);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}