import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String numbers = String.valueOf(n);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length(); i++) {
            int num = numbers.charAt(i) - '0';
            list.add(num);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            answer = answer * 10 + list.get(i);
        }
        
        return answer;
    }
}