class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        
        int result = Integer.parseInt(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(arr[i].equals("+")){
                result += Integer.parseInt(arr[i+1]);
            }
            else if(arr[i].equals("-")){
                result -= Integer.parseInt(arr[i+1]);
            }
            else if(arr[i].equals("*")){
                result *= Integer.parseInt(arr[i+1]);
            }
        }
        
        return result;
    }
}