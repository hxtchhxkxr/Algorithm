class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(String str : babbling){
            if(str.contains("ayaaya") ||
               str.contains("yeye") ||
               str.contains("woowoo") ||
               str.contains("mama")){
                continue;
            }
            
            for(String word : words){
                str = str.replace(word, " ");
            }
            
            str = str.trim();
            
            if(str.length() == 0){
                cnt++;
            }
        }
        
        return cnt;
    }
}