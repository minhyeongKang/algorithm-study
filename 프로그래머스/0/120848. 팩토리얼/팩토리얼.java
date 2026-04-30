class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;
        
        while (sum <= n) {
            answer++;
            sum *= answer;
        }
        answer = answer - 1;
        
        return answer;
    }
}