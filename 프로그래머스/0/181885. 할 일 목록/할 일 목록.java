class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0;
        for(int i=0; i<finished.length; i++){
            if(!finished[i]) len++;
        }
        
        String[] result = new String[len];
        int idx = 0;
        
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                result[idx] = todo_list[i];
                idx++;
            }
        }
        
        return result;
    }
}