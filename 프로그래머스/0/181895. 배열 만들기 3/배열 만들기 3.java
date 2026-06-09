class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len = 0;
        for(int i=0; i<intervals.length; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            
            len += e - s + 1;
        }
        
        int[] result = new int[len];
        
        int idx = 0;
        
        for(int i=0; i<intervals.length; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            
            for(int j=s; j<=e; j++){
                result[idx] = arr[j];
                idx++;
            }
        }
        
        return result;
    }
}