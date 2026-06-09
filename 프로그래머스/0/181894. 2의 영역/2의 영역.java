class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }
        
        if(start == -1){
            return new int[]{-1};
        }
        
        int[] result = new int[end - start + 1];
        
        for(int i=0; i<result.length; i++){
            result[i] = arr[start + i];
        }
        
        return result;
    }
}