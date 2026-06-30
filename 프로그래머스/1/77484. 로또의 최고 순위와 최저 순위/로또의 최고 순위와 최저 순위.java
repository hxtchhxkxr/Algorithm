class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // lottos와 win_nums 공통 개수 count
        int cnt = 0;
        int cnt0 = 0;
        
        for(int i=0; i<lottos.length; i++){
            int num = lottos[i];
            
            if(num == 0){
                cnt0++;
            }
            
            for(int j=0; j<win_nums.length; j++){
                if(num == win_nums[j]){
                    cnt++;
                }
            }
        }
        
        // max : count + 0개수
        int max = cnt + cnt0;
        
        if(max >= 2 && max <= 6){
            max = 7 - max;
        }
        else{
            max = 6;
        }
        
        // min : count
        int min = cnt;
        
        if(min >= 2 && min <= 6){
            min = 7 - min;
        }
        else{
            min = 6;
        }
        
        int[] result = {max,min};
        
        return result;
    }
}