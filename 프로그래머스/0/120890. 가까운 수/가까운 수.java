class Solution {
    public int solution(int[] array, int n) {
        int len = array.length;
        int[] diff = new int[len];
        
        for(int i=0; i<len; i++){
            diff[i] = Math.abs(array[i] - n);
        }
        
        int min = diff[0];
        int idx = 0;
        
        for(int i=1; i<len; i++){
            if(diff[i] < min){
                min = diff[i];
                idx = i;
            }
            else if(diff[i] == min && array[i] < array[idx]){
                idx = i;
            }
        }
        
        return array[idx];
    }
}