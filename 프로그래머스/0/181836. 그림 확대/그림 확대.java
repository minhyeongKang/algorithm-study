import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        String str = "";
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            str = picture[i];
            String expanded = "";
            
            for (int j = 0; j < str.length(); j++) {
                for (int l = 0; l < k; l++) {
                    expanded += str.charAt(j);
                }
            }
            
            for (int l = 0; l < k; l++) {
                list.add(expanded);
            }
        }
        
        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}