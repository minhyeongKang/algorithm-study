class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') answer += 'a';
            else if (str.charAt(i) == '1') answer += 'b';
            else if (str.charAt(i) == '2') answer += 'c';
            else if (str.charAt(i) == '3') answer += 'd';
            else if (str.charAt(i) == '4') answer += 'e';
            else if (str.charAt(i) == '5') answer += 'f';
            else if (str.charAt(i) == '6') answer += 'g';
            else if (str.charAt(i) == '7') answer += 'h';
            else if (str.charAt(i) == '8') answer += 'i';
            else if (str.charAt(i) == '9') answer += 'j';
        }
        return answer;
    }
}