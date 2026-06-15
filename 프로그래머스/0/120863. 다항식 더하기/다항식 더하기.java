class Solution {
    public String solution(String polynomial) {
        int coe = 0; // x계수
        int con = 0; // 상수
        
        String[] arr = polynomial.split(" ");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x")){
                if(arr[i].equals("x")){
                    coe++;
                }
                else{
                    coe += Integer.parseInt(arr[i].replace("x",""));
                }
            }
            else if(!arr[i].equals("+")){
                con += Integer.parseInt(arr[i]);
            }
        }
        
        if(coe == 0){
            return String.valueOf(con);
        }
        
        if(con == 0){
            return coe == 1 ? "x" : coe + "x";
        }
        
        return (coe == 1 ? "x" : coe + "x") + " + " + con;
    }
}