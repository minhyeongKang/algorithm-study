class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        
        for (int i = 0; i <= 9; i++) {
            sum2 += i;
        }
        
        answer = sum2 - sum1;
        
        return answer;
    }
}