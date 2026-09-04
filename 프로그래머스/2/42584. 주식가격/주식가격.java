import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] result = new int[len];
        
        for(int i=0; i<len; i++){
            int start = prices[i];
            Stack<Integer> s = new Stack<>();
            int cnt = 0;
            
            for(int j=i; j<len; j++){
                int price = prices[j];
                
                if(s.isEmpty()){
                    s.push(price);
                }
                else{
                    if(s.peek() >= start){
                        s.push(price);
                        cnt++;
                    }
                    else{
                        break;
                    }
                }
            }
            
            result[i] = cnt;
        }
        
        return result;
    }
}