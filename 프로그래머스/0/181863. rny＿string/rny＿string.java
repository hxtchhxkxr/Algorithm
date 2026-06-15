class Solution {
    public String solution(String rny_string) {
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<rny_string.length(); i++){
            if(rny_string.charAt(i) == 'm'){
                result.append("rn");
            }
            else{
                result.append(rny_string.charAt(i));
            }
        }
        
        return result.toString();
    }
}