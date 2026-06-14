class Solution {
    public int solution(int[] num_list) {
        int x = 0;
        
        while(true){
            if(isAllOne(num_list)) return x;
            
            for(int i = 0; i < num_list.length; i++){
                 if(num_list[i] > 1){
                     num_list[i] /= 2;
                     x++;
                }       
            } 
        }
    }
    
    public boolean isAllOne(int[] arr){
        for(int num : arr){
            if(num != 1){
                return false;
            }
        }
        return true;
    }
}