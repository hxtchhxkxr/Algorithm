import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        char target = String.valueOf(k).charAt(0);
        int cnt = 0;
        
        for(int a=i; a<=j; a++){
            String num = String.valueOf(a);
            
            for(int b=0; b<num.length(); b++){
                if(num.charAt(b) == target){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}