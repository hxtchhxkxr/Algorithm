class Solution {
    public int solution(int[] sides) {
        int max1 = Math.max(sides[0], sides[1]);
        int min1 = Math.min(sides[0], sides[1]);
        
        int cnt1 = min1 - 1;
        
        int max2 = sides[0] + sides[1];
        
        int cnt2 = max2 - max1;
        
        return cnt1 + cnt2;
    }
}