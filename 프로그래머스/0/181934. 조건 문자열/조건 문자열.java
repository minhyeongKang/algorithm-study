class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean result = false;
        
        if (ineq.equals("<") && eq.equals("=")) {
            result = n <= m;
            
            if(result) {
                answer = 1;
            }
        } else if (ineq.equals(">") && eq.equals("=")) {
            result = n >= m;
            
            if (result) {
                answer = 1;
            }
        } else if (ineq.equals("<") && eq.equals("!")) {
            result = n < m;
            
            if (result) {
                answer = 1;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            result = n > m;
            
            if (result) {
                answer = 1;
            }
        }
        
        return answer;
    }
}