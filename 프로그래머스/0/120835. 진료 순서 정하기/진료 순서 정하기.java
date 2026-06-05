class Solution {
    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){
            int order = 0;
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    order++;
                }
            }
            result[i] = order + 1;
        }
        
        return result;
    }
}