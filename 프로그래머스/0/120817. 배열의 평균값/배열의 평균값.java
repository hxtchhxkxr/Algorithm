class Solution {
    public double solution(int[] numbers) {      
        double sum = 0;
        
        for(int number : numbers){
            sum += number;
        }
        
        double avg = (double) sum / (double) numbers.length;
        
        return avg;
    }
}