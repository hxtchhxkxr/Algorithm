import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            boolean isDeleted = false;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    isDeleted = true;
                    break;
                }
            }
            
            if(!isDeleted){
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