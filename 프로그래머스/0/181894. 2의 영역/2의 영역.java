import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        if (start == -1) {
            return new int[]{-1};
        }
        
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}