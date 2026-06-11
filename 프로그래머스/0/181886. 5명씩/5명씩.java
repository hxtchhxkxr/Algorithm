class Solution {
    public String[] solution(String[] names) {
        int len = names.length % 5 == 0 ?
            names.length / 5 : names.length /5 + 1;
        
        String[] result = new String[len];
        
        for(int i=0; i<len; i++){
            result[i] = names[5 * i];
        }
        
        return result;
    }
}