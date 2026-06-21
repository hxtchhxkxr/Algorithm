class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int len = rank.length;
        
        int[] students = new int[len];
        
        int ranking = 1;
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(rank[j] == ranking){
                    students[i] = j;
                    ranking++;
                    break;
                }
            }
        }
        
        int[] selected = new int[3];
        int idx = 0;
        
        for(int i=0; i<len; i++){
            if(attendance[students[i]]){
                selected[idx] = students[i];
                idx++;
            }
            
            if(idx == 3){
                break;
            }
        }
        
        int a = selected[0];
        int b = selected[1];
        int c = selected[2];
        
        return 10000 * a + 100 * b + c;
    }
}