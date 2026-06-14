class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            if(isTrue(quiz[i])){
                result[i] = "O";
            }
            else{
                result[i] = "X";
            }
        }
        
        return result;
    }
    
    public boolean isTrue(String str){
        String[] arr = str.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        String op = arr[1];
        int b = Integer.parseInt(arr[2]);
        int result = Integer.parseInt(arr[4]);
        
        int calc;
        
        if(op.equals("+")){
            calc = a + b;
        }
        else{
            calc = a - b;
        }
        
        return calc == result;
    }
}