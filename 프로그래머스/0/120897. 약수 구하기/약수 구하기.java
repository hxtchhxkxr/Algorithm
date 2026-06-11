import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int num = 0;
        
        while(num!=n){
            num++;
            
            if(n%num == 0){
                list.add(num);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}