class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return sign2(sign1(x1,x2),sign1(x3,x4));
    }
    
    public boolean sign1(boolean x, boolean y){
        if(!x && !y) return false;
        else return true;
    }
    
    public boolean sign2(boolean x, boolean y){
        if(x && y) return true;
        else return false;
    }
}