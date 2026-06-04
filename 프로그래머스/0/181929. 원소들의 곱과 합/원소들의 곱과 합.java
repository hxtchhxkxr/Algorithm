class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int squareOfSum = 0;
        
        for(int num : num_list){
            mul *= num;
            squareOfSum += num;
        }
        
        squareOfSum *= squareOfSum;
        
        return mul < squareOfSum ? 1 : 0;
    }
}