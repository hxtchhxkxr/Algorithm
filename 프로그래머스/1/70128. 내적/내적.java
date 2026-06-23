class Solution {
    public int solution(int[] a, int[] b) {
        int dotProduct = 0;
        int len = a.length;
        
        for(int i=0; i<len; i++){
            dotProduct += a[i] * b[i];
        }
        
        return dotProduct;
    }
}