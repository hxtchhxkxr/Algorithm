import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        String result = "";
        
        for(int i=arr.length-1; i>=0; i--){
            result += arr[i];
        }
        
        return result;
    }
}