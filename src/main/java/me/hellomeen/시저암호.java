package me.hellomeen;

public class 시저암호 {
    public String solution(String s, int n) {

        char[] code = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char chars : code) {
            if (chars == ' ') {
                sb.append(" ");
                continue;
            }
            char secondChars = ' ';

            secondChars = (Character.isUpperCase(chars)) ? 'A' : 'a';
            chars += n;

            char shiftChars = (char) (secondChars + (chars - secondChars) % 26);
            sb.append(shiftChars);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        시저암호 result = new 시저암호();

        String s1 = "AB";
        int n1 = 1;
        System.out.println(result.solution(s1, n1));

        String s2 = "z";
        int n2 = 1;
        System.out.println(result.solution(s2, n2));

        String s3 = "a B z";
        int n3 = 4;
        System.out.println(result.solution(s3, n3));
    }
}

