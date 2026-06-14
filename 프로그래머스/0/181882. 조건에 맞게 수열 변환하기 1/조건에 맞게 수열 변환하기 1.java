class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int result[] = new int[len];
        
        for(int i=0; i<len; i++){
            if(arr[i] >= 50){
                if(arr[i] %2 == 0){
                    result[i] = arr[i] / 2;
                }
                else{
                    result[i] = arr[i];
                }
            }
            else{
                if(arr[i] %2 != 0){
                    result[i] = arr[i] * 2;
                }
                else{
                    result[i] = arr[i];
                }
            }
        }
        
        return result;
    }
}