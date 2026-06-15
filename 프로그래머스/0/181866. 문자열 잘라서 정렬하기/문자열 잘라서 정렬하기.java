import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] result = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(String s : result){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}