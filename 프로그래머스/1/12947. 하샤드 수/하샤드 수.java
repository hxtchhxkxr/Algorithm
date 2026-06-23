class Solution {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        
        int sum = 0;
        
        for(char c : arr){
            sum += c - '0';
        }
        
        return x % sum == 0;
    }
}