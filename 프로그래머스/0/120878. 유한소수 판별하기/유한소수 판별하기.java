class Solution {
    public int solution(int a, int b) {
        // a, b의 최대공약수 찾기
        int gcd = gcd(a,b);
        
        // b를 최대공약수로 나누기
        int num = b / gcd;
        
        // 나눈 수가 2,5 의 배수인지 확인하기
        while(num % 2 == 0){
            num /= 2;
        }
        
        while(num % 5 == 0){
            num /= 5;
        }
        
        return num == 1 ? 1 : 2;
    }
    
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}