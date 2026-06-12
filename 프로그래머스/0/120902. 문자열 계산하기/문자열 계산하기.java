class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        int result = Integer.parseInt(arr[0]);
        
        for(int i=1; i<arr.length; i+=2){
            int num = Integer.parseInt(arr[i+1]);
            
            if(arr[i].equals("+")){
                result += num;
            }
            else if(arr[i].equals("-")){
                result -= num;
            }
        }
        
        return result;
    }
}