class Solution {
    public int solution(int a, int b, int c) {
        int score;
        
        if(a != b && a != c && b != c){
            score = a + b + c;
        }
        else if( a == b && a == c && b == c){
            score = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        else {
            score = (a + b + c) * (a*a + b*b + c*c);
        }
        
        return score;
    }
}