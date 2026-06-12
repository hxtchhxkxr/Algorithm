import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        String result = "";
        
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            
            if(cnt == 1){
                result += arr[i];
            }
        }
        
        return result;
    }
}