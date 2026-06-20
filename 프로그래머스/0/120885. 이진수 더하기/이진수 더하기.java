class Solution {
    public String solution(String bin1, String bin2) {
        int bin1ToDecimal = binaryToDecimal(bin1);
        int bin2ToDecimal = binaryToDecimal(bin2);
        
        int sum = bin1ToDecimal + bin2ToDecimal;
        
        return decimalToBinary(sum);
    }
    
    public int binaryToDecimal(String binary){
        int result = 0;
        
        for(int i=0; i<binary.length(); i++){
            int num = binary.charAt(i) - '0';
            
            result = result*2 + num;
        }
        
        return result;
    }
    
    public String decimalToBinary(int decimal){
        if(decimal == 0) return "0";
        
        String result = "";
        
        while(decimal > 0){
            int rem = decimal % 2;
            
            result += String.valueOf(rem);
            
            decimal /= 2;
        }
        
        return new StringBuilder(result).reverse().toString();
    }
}