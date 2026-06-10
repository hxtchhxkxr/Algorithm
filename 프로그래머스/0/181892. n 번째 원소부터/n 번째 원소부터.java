class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length - n + 1;
        
        int[] result = new int[len];
        
        for(int i=0; i<len; i++){
            result[i] = num_list[n - 1 + i]; 
        }
        
        return result;
    }
}