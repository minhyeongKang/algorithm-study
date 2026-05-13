import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 1; j <= arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            } else if (flag[i] == false) {
                for (int j = 1; j <= arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}