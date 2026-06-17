class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String num = "";
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(Character.isDigit(c)){
                num += c;
            }
            else{
                if(!num.isEmpty()){
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        
        if (!num.isEmpty()){
            sum += Integer.parseInt(num);
        }
        
        return sum;
    }
}