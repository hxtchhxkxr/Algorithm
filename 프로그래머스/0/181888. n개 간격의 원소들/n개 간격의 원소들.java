class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length%n == 0 ? 
            num_list.length / n : num_list.length / n + 1;
        
        int[] result = new int[len];
        
        int idx = 0;
        
        for(int i=0; i<len; i++){
            result[i] = num_list[idx];
            idx += n;
        }
        
        return result;
    }
}