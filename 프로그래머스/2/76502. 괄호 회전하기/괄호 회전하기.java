import java.util.*;

class Solution {
    public int solution(String s) {
        int len = s.length();
        int cnt = 0;
        
        for(int i=0; i<len; i++){
            Stack<Character> st = new Stack<>();
            
            for(int j=i; j<i+len; j++){
                char c = s.charAt(j%len);
                
                if(st.empty()){
                    st.push(c);
                }
                else if((st.peek() == '(' && c == ')')
                       || (st.peek() == '[' && c == ']')
                       || (st.peek() == '{' && c == '}')){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            
            if(st.empty()){
                cnt++;
            }
        }
        
        return cnt;
    }
}