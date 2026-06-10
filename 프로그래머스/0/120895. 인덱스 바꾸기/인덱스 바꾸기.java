class Solution {
    public String solution(String my_string, int num1, int num2) {
        int len = my_string.length();
        char[] arr = new char[len];
        
        for(int i = 0; i<len; i++){
            arr[i] = my_string.charAt(i);
        }
        
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        
        return new String(arr);
    }
}