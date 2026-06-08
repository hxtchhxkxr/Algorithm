class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int len = my_strings.length;
        
        String str = "";
        
        for(int i=0; i<len; i++){
            int start = parts[i][0];
            int end = parts[i][1];
            for(int j=start; j<=end; j++){
                str += my_strings[i].charAt(j);
            }
        }
        
        return str;
    }
}