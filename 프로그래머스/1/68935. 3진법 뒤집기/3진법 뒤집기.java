import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        while (n > 0) {
            str += (n % 3);
            n /= 3;
        }
        
        int count = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            
            answer += num * (int)Math.pow(3, count);
            count--;
        }
        
        return answer;
    }
}