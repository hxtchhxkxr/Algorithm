class Solution {
    public int solution(int[][] arr) {
        boolean isSatisfied = true;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] != arr[j][i]){
                    isSatisfied = false;
                    break;
                }
            }
        }
        
        return isSatisfied ? 1 : 0;
    }
}