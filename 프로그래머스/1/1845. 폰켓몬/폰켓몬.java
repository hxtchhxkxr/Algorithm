import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 폰켓몬 <종류 : 개수> 해시맵
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        
        // 폰켓몬 종류 수
        int kind = map.size();
        // 선택 가능한 개수
        int pick = nums.length / 2;
        
        return Math.min(kind, pick);
    }
}