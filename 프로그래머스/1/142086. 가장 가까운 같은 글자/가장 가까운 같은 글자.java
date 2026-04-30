import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            
            for (int j = i - 1; j >= 0; j--) {
                
                if (s.charAt(i) == s.charAt(j)) {
                    list.add(i - j);
                    found = true;
                    break;
                }
            }
            
            if (found == false) {
                list.add(-1);
            }
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}