class Solution {
    public int[] solution(int n, int[] numlist) {
        int len = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0)len ++;
        }
        
        int[] result = new int[len];
        int idx = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                result[idx] = numlist[i];
                idx++;
            }
        }
        
        return result;
    }
}