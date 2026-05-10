import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] targetCount = new int[id_list.length];
        
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < report.length; i++) {
            set.add(report[i]);
        }
        
        for (String r : set) {
            String[] userReport = r.split(" ");
            String target = userReport[1];
            
            for (int i = 0; i < id_list.length; i++) {
                if (id_list[i].equals(target)) {
                    targetCount[i]++;
                }
            }
        }
        
        for (String r : set) {
            String[] userReport = r.split(" ");
            String user = userReport[0];
            String target = userReport[1];
            
            int userIndex = -1;
            int targetIndex = -1;
            
            for (int i = 0; i < id_list.length; i++) {
                if (id_list[i].equals(user)) {
                    userIndex = i;
                }
                if (id_list[i].equals(target)) {
                    targetIndex = i;
                }
            }
            
            if (targetCount[targetIndex] >= k) {
                answer[userIndex]++;
            }
        }
        
        return answer;
    }
}