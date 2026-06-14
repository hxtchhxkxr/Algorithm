class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        
        if(len >= 11){
            int sum = 0;
            for(int num : num_list){
                sum += num;
            }
            return sum;
        }
        else{
            int mul = 1;
            for(int num : num_list){
                mul *= num;
            }
            return mul;
        }
    }
}