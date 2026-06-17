class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        
        for(int i=0; i<3; i++){
            int start = lines[i][0];
            int end = lines[i][1];
            
            for(int j=start; j<end; j++){
                arr[j+100]++;
            }
        }
        
        int cnt = 0;
        
        for(int i=0; i<200; i++){
            if(arr[i] >= 2){
                cnt++;
            }
        }
        
        return cnt;
    }
}