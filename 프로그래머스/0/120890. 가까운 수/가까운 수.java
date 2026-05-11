class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = Integer.MAX_VALUE;
        int num = 0;
        
        for (int i = 0; i < array.length; i++) {
            num = Math.abs(array[i] - n);
            
            if (num < max) {
                max = num;
                answer = array[i];
            } else if (num == max) {
                answer = Math.min(answer, array[i]);
            }
        }
        
        return answer;
    }
}