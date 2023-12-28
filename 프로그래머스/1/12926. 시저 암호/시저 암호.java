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
            if (Character.isLowerCase(chars)) {
                secondChars = 'a';
            }
            if (Character.isUpperCase(chars)) {
                secondChars = 'A';
            }
            chars += n;

            char shiftChars = (char) (secondChars + (chars - secondChars) % 26);
            sb.append(shiftChars);
        }

        return sb.toString();
    }
}