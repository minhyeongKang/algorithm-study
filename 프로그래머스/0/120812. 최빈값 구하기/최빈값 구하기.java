import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        
        List<Integer> setList = new ArrayList<>(set);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < set.size(); i++) {
            int currentNum = setList.get(i);
            int count = 0;
            
            for (int j = 0; j < array.length; j++) {
                if (currentNum == array[j]) {
                    count++;
                }
            }
            map.put(currentNum, count);
        }
        
        int maxCount = -1;
        int check = 0;
        
        for (int key : map.keySet()) {
            int currentCount = map.get(key);
            
            if (currentCount > maxCount) {
                maxCount = currentCount;
                answer = key;
                check = 1;
            } else if (currentCount == maxCount) {
                check++;
            }
        }
        
        if (check > 1) {
            answer = -1;
        }
        
        
        return answer;
    }
}