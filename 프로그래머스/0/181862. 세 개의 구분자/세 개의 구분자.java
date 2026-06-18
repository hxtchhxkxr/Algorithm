import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> arr = new ArrayList<>();
        int idx = 0;
        
        while(idx < myStr.length()){
            String str = "";
            
            while(idx < myStr.length() &&
                  myStr.charAt(idx) != 'a' &&
                  myStr.charAt(idx) != 'b' &&
                  myStr.charAt(idx) != 'c'){
                str += myStr.charAt(idx);
                idx++;
            }
            
            if(!str.equals("")){
                arr.add(str);
            }
            
            if(idx < myStr.length()){
                idx++;
            }
        }
        
        if(arr.size() == 0){
            return new String[]{"EMPTY"};
        }
        
        return arr.toArray(new String[0]);
    }
}