import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        int[] arr = new int[k];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                arr[i] = score[i];
                Arrays.sort(arr, 0, i + 1);
            } else {
                if (score[i] > arr[0]) {
                    arr[0] = score[i];
                    Arrays.sort(arr);
                }
            }
            
            list.add(arr[0]);
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}