class Solution {
    public int[] solution(String s) {
        int convertCnt = 0;
        int cnt0 = 0;
        
        while(!s.equals("1")){
            convertCnt ++;
            int len = 0;
            
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c == '0'){
                    cnt0++;
                }
                else{
                    len++;
                }
            }
            
            // len을 2진법으로 바꾸기
            String newStr = "";
            
            while(len!=0){
                if(len%2 == 1){
                    newStr += '1';
                }
                else{
                    newStr += '0';
                }
                
                len /= 2;
            }
            
            s = newStr;
        }
        
        return new int[] {convertCnt, cnt0};
    }
}