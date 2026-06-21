class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture.length * k;
        String[] result = new String[len];
        
        int idx = 0;
        
        for(int i=0; i<picture.length; i++){
            String str = "";
            
            for(int j=0; j<picture[i].length(); j++){
                for(int l=0; l<k; l++){
                    str += picture[i].charAt(j);
                }
            }
            
            for(int j=0; j<k; j++){
                result[idx] = str;
                idx++;
            }
        }
        
        return result;
    }
}