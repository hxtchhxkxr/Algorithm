import java.util.*;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        // A 오름차순, B 내림차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<B.length/2; i++){
            int temp = B[i];
            B[i] = B[B.length - i - 1];
            B[B.length - i - 1] = temp;
        }
        
        int sum = 0;
        
        for(int i=0; i<A.length; i++){
            sum += A[i] * B[i];
        }
        
        return sum; 
    }
}