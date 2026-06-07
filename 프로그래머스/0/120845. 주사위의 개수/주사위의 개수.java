class Solution {
    public int solution(int[] box, int n) {
        int mul = 1;
        for(int i=0; i<box.length; i++){
            mul *= box[i] / n;
        }
        return mul;
    }
}