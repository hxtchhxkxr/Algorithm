import java.util.*;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        String result = "";
        
        for(int i=0; i<arr.length; i++){
            result += arr[arr.length - i -1];
        }
        
        return Long.parseLong(result);
    }
}