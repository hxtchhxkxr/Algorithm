import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        
        String[] arr = new String[len];
        
        for(int i=0; i<len; i++){
            String suffix = "";
            for(int j=i; j<len; j++){
                suffix += my_string.charAt(j);
            }
            arr[i] = suffix;
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
}