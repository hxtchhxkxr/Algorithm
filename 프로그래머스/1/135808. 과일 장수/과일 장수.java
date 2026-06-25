import java.util.*;

class Solution {
    // k : 사과의 최대 점수
    // m : 한 상자에 들어가는 사과의 수
    // score[] : 사과들의 점수
    public int solution(int k, int m, int[] score) {
        // score[] 내림차순 정렬
        Arrays.sort(score);
        
        for(int i=0; i<score.length/2; i++){
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length -1 - i] = temp;
        }
        
        // m, 2m, 3m ... 합 구하기
        int sum = 0;
        
        for(int i=0; i<score.length; i++){
            if(i % m == m-1){
                sum += score[i];
            }
        }
        
        return sum * m;
    }
}