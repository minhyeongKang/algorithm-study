import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < photo.length; i++) {
            String arr[] = photo[i];
            int sum = 0;
            
            for (int j = 0; j < arr.length; j++) {
                
                for (int k = 0; k < name.length; k++) {
                    
                    if (arr[j].equals(name[k])) {
                        sum += yearning[k];
                    }
                }
            }
            
            list.add(sum);
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}