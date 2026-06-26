import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // nums 합의 최대값은 오름차순 정렬에서 맨 끝 3개의 합
        Arrays.sort(nums);
        int max = nums[nums.length -1] + nums[nums.length - 2] + nums[nums.length - 3];
        
        // 2~max까지 소수 판별
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime,true);
        
        for(int i=2; i*i<=max; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=max; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        
        // nums 중 3개 합이 소수가 되는 경우 count
        int cnt = 0;
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime[sum]){
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
}