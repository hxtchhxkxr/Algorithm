class Solution {
    public String solution(int age) {
        String result = "";
        
        while(age!=0){
            result += (char)(age % 10 + 'a');
            age /=10;
        }
        
        return new StringBuilder(result).reverse().toString();
    }
}