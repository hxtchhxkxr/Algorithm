class Solution {
    public int solution(int[] num_list, int n) {
        boolean isExist = false;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] == n){
                isExist = true;
                break;
            }
        }
        
        return isExist ? 1 : 0;
    }
}