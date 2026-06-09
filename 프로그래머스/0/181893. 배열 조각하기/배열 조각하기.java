class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = query.length - 1;
                
        for(int i=0; i<query.length; i++){        
            if(i%2 == 0){
                end = start + query[i];
            }
            else{
                start = start + query[i];
            }
        }
        
        int[] result = new int[end - start + 1];
        
        for(int i=0; i<result.length; i++){
            result[i] = arr[i+start];
        }
        
        return result;
    }
}