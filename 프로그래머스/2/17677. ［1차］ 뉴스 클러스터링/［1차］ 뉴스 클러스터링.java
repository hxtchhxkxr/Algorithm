import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> multiSet1 = createMultiSet(str1);
        ArrayList<String> multiSet2 = createMultiSet(str2);
        
        //System.out.println(multiSet1);
        //System.out.println(multiSet2);

        int intersect = calIntersect(multiSet1, multiSet2).size();
        int union = calUnion(multiSet1, multiSet2).size();
        
        // System.out.println(calIntersect(multiSet1, multiSet2));
        // System.out.println(calUnion(multiSet1, multiSet2));
        
        if(union == 0){
            return 65536;
        }
        
        double answer = (double) intersect / union;
        
        return (int)(answer * 65536);
    }
    
    // 다중집합
    private ArrayList<String> createMultiSet(String str){
        char[] arr = str.toCharArray();
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<arr.length - 1; i++){
            String sum = "";
            
            char c1 = arr[i];
            char c2 = arr[i+1];
            
            if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)){
                sum += Character.toLowerCase(c1);
                sum += Character.toLowerCase(c2);
            }
            
            if(!sum.equals("")){
                list.add(sum);
            }
        }
        
        return list;
    }
    
    // 교집합
    private ArrayList<String> calIntersect(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>(list2);
        
        for(int i=0; i<list1.size(); i++){
            String str = list1.get(i);
            
            if(temp.contains(str)){
                list.add(str);
                temp.remove(str);
            }
        }
        
        return list;
    }
    
    // 합집합
    private ArrayList<String> calUnion(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> list = new ArrayList<>();
        
        ArrayList<String> intersect = calIntersect(list1, list2);
        
        for(int i=0; i<intersect.size(); i++){
            String str = intersect.get(i);
            list1.remove(str);
            list2.remove(str);
            
            list.add(str);
        }
        
        for(int i=0; i<list1.size(); i++){
            list.add(list1.get(i));
        }
        
        for(int i=0; i<list2.size(); i++){
            list.add(list2.get(i));
        }
        
        return list;
    }
}