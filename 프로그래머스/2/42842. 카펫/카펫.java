class Solution {
    public int[] solution(int brown, int yellow) {
        // 가로 * 세로 = brown + yellow
        // (가로-2)*(세로-2) = yellow
        
        int width = 3;
        int height = 3;
        
        for(int i=width; i<=5000; i++){
            for(int j=height; j<=i; j++){
                if(i * j == brown + yellow &&
                  (i - 2) * (j - 2 ) == yellow){
                    width = i;
                    height = j;
                    break;
                }
            }
        }
        
        return new int[] {width, height};
    }
}