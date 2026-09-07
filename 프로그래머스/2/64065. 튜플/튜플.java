import java.util.*;

class Solution {
    public int[] solution(String s) {
        ArrayList<ArrayList<Integer>> list = stringToStackList(s);
        
        list.sort((s1, s2) -> s1.size() - s2.size());
        
        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            int num = list.get(i).get(0);
            
            result[i] = num;
            
            for(int j = i+1; j<list.size(); j++){
                list.get(j).remove(Integer.valueOf(num));
            }
        }
        
        return result;
    }
    
    private ArrayList<ArrayList<Integer>> stringToStackList(String s){
        s = s.substring(2, s.length() - 2);
        char[] arr = s.toCharArray();
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        result.add(list);
        
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            
            if(Character.isDigit(c)){
                int num = 0;
                
                while(i < arr.length && Character.isDigit(arr[i])){
                    num = num * 10 + (arr[i] - '0');
                    i++;
                }
                
                result.get(result.size() - 1).add(num);
                
                i--;
            }
            else if (c == '}'){
                ArrayList<Integer> list1 = new ArrayList<>();
                result.add(list1);
            }
        }
        
        return result;
    }
}