class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] result = my_string.toCharArray();
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            while(s<e){
                char temp = result[s];
                result[s] = result[e];
                result[e] = temp;
                 
                s++;
                e--;
            }
        }
        
        return new String(result);
    }
}