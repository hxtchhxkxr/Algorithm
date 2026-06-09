class Solution {
    public int solution(int[] arr, int idx) {
        int result = -1;
        
        for(int i=0; i<arr.length; i++){
            if(i >= idx && arr[i] == 1){
                result = i;
                break;
            }
        }
        
        return result;
    }
}