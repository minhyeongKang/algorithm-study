import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String upper = "";
        String lower = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper += s.charAt(i);
            } else {
                lower += s.charAt(i); 
            }
        }
        
        char[] uppArr = upper.toCharArray();
        char[] lowArr = lower.toCharArray();
        
        Arrays.sort(uppArr);
        Arrays.sort(lowArr);
        upper = "";
        lower = "";
        
        for (int i = uppArr.length - 1; i >= 0; i--) {
            upper += uppArr[i];
        }
        
        for (int i = lowArr.length - 1; i >= 0; i--) {
            lower += lowArr[i];
        }
        
        return answer = lower + upper;
    }
}