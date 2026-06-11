class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int idx = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
                idx = i;
            }
        }
        
        int[] result = new int[2];
        result[0] = max;
        result[1] = idx;
        
        return result;
    }
}