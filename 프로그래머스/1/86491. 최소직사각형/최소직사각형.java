import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int len = sizes.length;
        
        int[] minArr = new int[len];
        int[] maxArr = new int[len];
        
        for(int i=0; i<len; i++){
            minArr[i] = Math.min(sizes[i][0], sizes[i][1]);
            maxArr[i] = Math.max(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(minArr);
        Arrays.sort(maxArr);
        
        return minArr[len-1] * maxArr[len-1];
    }
}