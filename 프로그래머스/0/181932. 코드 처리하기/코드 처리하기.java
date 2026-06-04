class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for(int idx = 0; idx<code.length(); idx++){
            // mode가 0일 때
            if(mode == 0){
                // code[idx]가 1이 아니고
                if(code.charAt(idx) != '1'){
                    // idx가 짝수일 때
                    if(idx % 2 == 0){
                        ret += code.charAt(idx);
                    }
                }
                // code[idx]가 1이면
                else{
                    mode = 1;
                }
                
            }
            // mode가 1일 때
            else{
                // code[idx]가 1이 아니고
                if(code.charAt(idx) != '1'){
                    // idx가 홀수일 때 
                    if(idx % 2 != 0){
                        ret += code.charAt(idx);
                    }
                }
                // code[idx]가 1이면
                else{
                    mode = 0;
                }
            }
        }
        
        return !ret.equals("") ? ret : "EMPTY";
    }
}