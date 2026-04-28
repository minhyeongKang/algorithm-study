import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int rows = arr.length;
        int cols = arr[0].length;
        
        int size = Math.max(rows, cols);
        
        answer = new int[size][size];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}