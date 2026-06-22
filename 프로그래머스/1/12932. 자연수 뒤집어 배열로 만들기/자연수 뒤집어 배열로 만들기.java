class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        
        int[] result = new int[arr.length];
        int idx = result.length - 1;
        
        for(int i=0; i<result.length; i++){
            result[i] = arr[idx] - '0';
            idx--;
        }
        
        return result;
    }
}