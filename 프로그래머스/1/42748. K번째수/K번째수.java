import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int l = 0; l < commands.length; l++) {
            int[] arr = commands[l];
            
            int i = arr[0];
            int j = arr[1];
            int k = arr[2];
            
            int[] cut = new int[j - i + 1];
            
            for (int m = i; m <= j; m++) {
                cut[m - i] = array[m - 1];
            }
            
            Arrays.sort(cut);
            
            answer[l] = cut[k - 1];
            
        }
        
        return answer;
    }
}