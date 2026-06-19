import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<flag.length; i++){
            int num = arr[i];
            
            if(flag[i]){
                for(int j=0; j<num*2; j++){
                    list.add(num);
                }
            }
            else{
                for(int j=0; j<num; j++){
                    list.remove(list.size() - 1);
                }
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}