class Solution {
    public int solution(String[] order) {
        int priceSum = 0;
        
        for(int i=0; i<order.length; i++){
            if(order[i].contains("americano") || order[i].equals("anything")){
                priceSum += 4500;
            }
            else if(order[i].contains("cafelatte")){
                priceSum += 5000;
            }
        }
        
        return priceSum;
    }
}