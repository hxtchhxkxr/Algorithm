import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int len = arr.length;
        int x = 0;
        
        while(true){
            int[] convertArr = new int[len];
            
            for(int i=0; i<len; i++){
                if(arr[i] >= 50){
                    if(arr[i] % 2 == 0){
                        convertArr[i] = arr[i] / 2;
                    }
                    else{
                        convertArr[i] = arr[i];
                    }
                }
                else{
                    if(arr[i] % 2 != 0){
                        convertArr[i] = arr[i] * 2 + 1;
                    }
                    else{
                        convertArr[i] = arr[i];
                    }
                }
            }
            
            if(Arrays.equals(arr, convertArr)){
                return x;
            }
            
            arr = convertArr;
            x++;
        }
    }
}