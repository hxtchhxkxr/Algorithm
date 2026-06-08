import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                list.add(my_string.charAt(i) - '0');
            }
        }
        
        int sum = 0;
        
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        
        return sum;

    }
}