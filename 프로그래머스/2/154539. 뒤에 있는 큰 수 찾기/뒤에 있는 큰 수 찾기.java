import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            result[i] = -1;
        }
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<numbers.length; i++){
            while(!s.isEmpty() && numbers[s.peek()] < numbers[i]){
                int idx = s.pop();
                result[idx] = numbers[i];
            }
            
            s.push(i);
        }
        
        return result;
    }
}