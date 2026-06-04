class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for(int num : num_list){
            // num이 홀수면 
            if(num % 2 != 0){
                odd += Integer.toString(num);
            }
            // num이 짝수면
            else{
                even += Integer.toString(num);
            }
        }
        
        return Integer.parseInt(odd) + Integer.parseInt(even);
        
    }
}