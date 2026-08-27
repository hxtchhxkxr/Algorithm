class Solution {
    public int[] solution(int n, String[] words) {
        int num;    // 사람의 번호
        int index;  // 지금 몇 번째 차례인지
        
        for(int i=1; i<words.length; i++){
            index = i / n + 1;
            num = i % n + 1;
            
            if(words[i].length() == 1){
                return new int[]{num, index};
            }
            
            if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)){
                return new int[]{num, index};
            }
            
            for(int j=0; j<i; j++){
                if(words[i].equals(words[j])){
                    return new int[]{num, index};
                }
            }
        }

        return new int[]{0, 0};
    }
}