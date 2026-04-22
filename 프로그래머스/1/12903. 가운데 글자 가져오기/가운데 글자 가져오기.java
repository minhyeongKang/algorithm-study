class Solution {
    public String solution(String s) {
        String answer = "";
        int index = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            for (int i = index - 1; i <= index; i++){
                answer += s.charAt(i);
            }
        } else {
            answer += s.charAt(index);
        }
        
        return answer;
    }
}