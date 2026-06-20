class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        
        while(len < arr.length){
            len *= 2;
        }
        
        int[] result = new int[len];
        
        for(int i=0; i<arr.length; i++){
            result[i] = arr[i];
        }
        
        return result;
    }
}