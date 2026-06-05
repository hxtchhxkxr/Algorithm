class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] arr = new int[num2 - num1 + 1];
        
        for(int i=0; i<num2-num1+1; i++){
            arr[i] = numbers[num1 + i];
        }
        
        return arr;
    }
}