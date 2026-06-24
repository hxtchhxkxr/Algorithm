import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] case1 = {1,2,3,4,5};
        int[] case2 = {2,1,2,3,2,4,2,5};
        int[] case3 = {3,3,1,1,2,2,4,4,5,5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == case1[i % case1.length]) score1++;
            if(answers[i] == case2[i % case2.length]) score2++;
            if(answers[i] == case3[i % case3.length]) score3++;
        }
        
        int max = Math.max(score1, Math.max(score2, score3));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(score1 == max) list.add(1);
        if(score2 == max) list.add(2);
        if(score3 == max) list.add(3);
        
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}