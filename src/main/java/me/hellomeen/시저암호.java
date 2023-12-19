package me.hellomeen;

public class 시저암호 {
    public String solution(String s, int n) {

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char A : chars) {
            if (A >= 65 && A <= 90) {
                A += n;
                if (A > 90) {
                    char B = (char) ((A - 65) % 26 + 65);
                    sb.append(B);
                    continue;
                }
            }

            if (A >= 97 && A <= 122) {
                A += n;
                if (A > 122) {
                    char B = (char) ((A - 97) % 26 + 97);
                    sb.append(B);
                    continue;
                }
            }
            sb.append(A);
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

