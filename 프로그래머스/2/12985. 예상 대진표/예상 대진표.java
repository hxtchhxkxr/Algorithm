class Solution
{
    public int solution(int n, int a, int b)
    {
        int cnt = 0;
        
        while(a != b){
            a = nextNum(a);
            b = nextNum(b);
            cnt++;
        }
        
        return cnt;
    }
    
    int nextNum(int n){
        if(n % 2 == 0){
            return n / 2;
        }
        else{
            return (n + 1) / 2;
        }
    }
}