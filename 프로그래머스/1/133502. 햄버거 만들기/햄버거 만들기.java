import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> burger = new ArrayList<>();

        for (int i = 0; i < ingredient.length; i++) {
            burger.add(ingredient[i]);
            if (burger.size() >= 4
                    && burger.get(burger.size()-4) == 1
                    && burger.get(burger.size()-3) == 2
                    && burger.get(burger.size()-2) == 3
                    && burger.get(burger.size()-1) == 1) {
                answer ++;
                
                for (int j = 0; j < 4; j++) {
                    burger.remove(burger.size()-1);    
                }
            }
        }

        return answer;
    }
}