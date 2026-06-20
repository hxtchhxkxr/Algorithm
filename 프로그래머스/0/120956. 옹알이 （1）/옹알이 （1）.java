class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling){
            for(String sound : sounds){
                word = word.replace(sound, " ");
            }
            
            word = word.replace(" ", "");
            
            if(word.length() == 0){
                cnt++;
            }
        }
        
        return cnt;
    }
}