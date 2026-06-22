import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        
        int sum = 0;
        
        for(char c : arr){
            sum += c - '0';
        }
        
        return sum;
    }
}