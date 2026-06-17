class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean isExist = false;
        
        int wordLen = spell.length;
        
        for(int i=0; i<dic.length; i++){
            if(dic[i].length() == wordLen){
                boolean found = true;
                
                for(String s : spell){
                    if (!dic[i].contains(s)){
                        found = false;
                        break;
                    }
                }
                
                if(found){
                    isExist = true;
                    break;
                }
            }
        }
        
        
        return isExist ? 1 : 2;
    }
}