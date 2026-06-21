class Solution {
    public int[] solution(int num, int total) {
        // 1부터 num까지의 합
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        
        int add = (total - sum) / num;
        
        int[] result = new int[num];
        
        for(int i=0; i<num; i++){
            result[i] = i + 1 + add;
        }
        
        return result;
    }
}