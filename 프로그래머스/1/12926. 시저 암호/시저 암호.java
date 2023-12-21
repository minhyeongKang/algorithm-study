class Solution {
    public String solution(String s, int n) {

        char[] code = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char chars : code) {
            if (chars == ' ') {
                sb.append(" ");
                continue;
            }
            char secondChars = ' ';
            if (chars >= 'A' && chars <= 'Z') {
                secondChars = 'A';
            }
            if (chars >= 'a' && chars <= 'z') {
                secondChars = 'a';
            }
            chars += n;

            char shiftChars = (char) (secondChars + (chars - secondChars) % 26);
            sb.append(shiftChars);
        }

        return sb.toString();
    }
}