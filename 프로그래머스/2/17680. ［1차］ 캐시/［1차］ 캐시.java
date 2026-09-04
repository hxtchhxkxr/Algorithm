import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0){
            return cities.length * 5;
        }   
        
        ArrayList<String> cache = new ArrayList<>();
        int time = 0;
        
        for(String city : cities){
            city = city.toLowerCase();
            
            if(cache.contains(city)){
                cache.remove(cache.indexOf(city));
                cache.add(city);
                time += 1;
            }
            else{
                if(cache.size() == cacheSize){
                    cache.remove(0);
                }
                cache.add(city);
                time += 5;
            }
        }
        
        return time;
    }
}