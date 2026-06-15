class Solution {
    public String[] solution(String[] strArr) {
        int len = 0;
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                len++;
            }
        }
        
        String[] result = new String[len];
        int idx = 0;
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                result[idx] = strArr[i];
                idx++;
            }
        }
        
        return result;
    }
}