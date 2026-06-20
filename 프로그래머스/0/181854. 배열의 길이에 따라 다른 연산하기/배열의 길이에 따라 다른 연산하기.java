class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        
        // arr 길이 홀수 -> 짝수 인덱스에 n더함
        if(len%2 != 0){
            for(int i=0; i<len; i+=2){
                arr[i] += n;
            }
        }
        // arr 길이 짝수 -> 홀수 인덱스에 n더함
        else{
            for(int i=1; i<len; i+=2){
                arr[i] += n;
            }
        }
        
        return arr;
    }
}