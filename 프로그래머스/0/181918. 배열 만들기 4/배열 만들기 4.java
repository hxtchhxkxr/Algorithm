import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        int i = 0; 
        
        while(i<arr.length){
            if(stk.isEmpty()){
                stk.push(arr[i]);
                i++;
            }
            else if(!stk.isEmpty() && stk.peek() < arr[i]){
                stk.push(arr[i]);
                i++;
            }
            else if(!stk.isEmpty() && stk.peek() >= arr[i]){
                stk.pop();
            }
        }
        
        if(stk.isEmpty()){
            return new int[]{-1};
        }

        ArrayList<Integer> stk1 = new ArrayList<>();
        
        while(!stk.isEmpty()){
            stk1.add(stk.pop());
        }
        
        int[] stk2 = new int[stk1.size()];
        
        for(int j=0; j<stk1.size(); j++){
            stk2[j] = stk1.get(stk1.size() - 1 - j);
        }
        
        return stk2;
    }
}