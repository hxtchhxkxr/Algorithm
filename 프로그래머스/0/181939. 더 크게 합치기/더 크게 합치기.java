class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aToString = a + "";
        String bToString = b + "";
        
        int aSumb = Integer.parseInt(aToString + bToString);
        int bSuma = Integer.parseInt(bToString + aToString);
        
        return aSumb >= bSuma ? aSumb : bSuma;
    }
}