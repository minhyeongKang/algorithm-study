import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == true) {
                list.add(i);
            }
        }
        
        int[] student = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            student[i] = list.get(i);
        }
        
        int[] pick = new int[3];

        for (int k = 0; k < 3; k++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;

            for (int i = 0; i < student.length; i++) {
                if (rank[student[i]] < min) {
                    min = rank[student[i]];
                    idx = student[i];
                }
            }

            pick[k] = idx;
            rank[idx] = Integer.MAX_VALUE;
        }
        
        answer = (10000*pick[0]) + (100*pick[1]) + pick[2];
        
        return answer;
    }
}