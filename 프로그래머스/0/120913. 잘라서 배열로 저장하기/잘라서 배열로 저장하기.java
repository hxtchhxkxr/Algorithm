class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n == 0 ?
            my_str.length() / n : my_str.length() / n + 1;
        
        String[] result = new String[len];
        
        for(int i=0; i<len; i++){
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            
            result[i] = my_str.substring(start, end);
        }
        
        return result;
    }
}