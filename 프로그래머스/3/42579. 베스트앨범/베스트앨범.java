import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // <장르, 재생횟수>
        HashMap<String, Integer> genrePlayCnt = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            String genre = genres[i];
            int play = plays[i];
            
            genrePlayCnt.put(genre, genrePlayCnt.getOrDefault(genre, 0) + play);
        }
        
        // 재생횟수 기준으로 내림차순 정렬
        List<Map.Entry<String, Integer>> list = new ArrayList<>(genrePlayCnt.entrySet());
        
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        ArrayList<Integer> bestAlbum = new ArrayList<>();
        
        for(int i=0; i<list.size(); i++){
            String genre = list.get(i).getKey();
            
            // <고유번호, 재생횟수>
            HashMap<Integer, Integer> playCntById = new HashMap<>();
            
            for(int j=0; j<genres.length; j++){
                if(genre.equals(genres[j])){
                    playCntById.put(j, plays[j]);
                }
            }
            
            List<Map.Entry<Integer, Integer>> list1 = new ArrayList<>(playCntById.entrySet());
            list1.sort((a, b) -> b.getValue() - a.getValue());
            
            bestAlbum.add(list1.get(0).getKey());
            
            if(list1.size() >= 2){
                bestAlbum.add(list1.get(1).getKey());
            }
        }
        
        int[] result = new int[bestAlbum.size()];
        
        for(int i=0; i<bestAlbum.size(); i++){
            result[i] = bestAlbum.get(i);
        }
        
        return result;
    }
}