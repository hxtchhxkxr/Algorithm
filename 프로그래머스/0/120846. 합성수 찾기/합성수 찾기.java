class Solution {
    public int solution(int n) {
        int[] arr = new int[101];
        
        for(int i=1;i<=100;i++){
            arr[i] = 0;
            for(int j=1;j<=i;j++){
                if(i%j == 0){
                    arr[i]++;
                }
            }
        }
        
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(arr[i]>=3){
                cnt++;
            }
        }
        
        return cnt;
    }
}