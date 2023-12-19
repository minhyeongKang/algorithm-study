package me.hellomeen;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        음양더하기 result = new 음양더하기();
        int[] absolutes = {1, 3, 5};
        boolean[] signs = {false, false, true};
        System.out.println(result.solution(absolutes, signs));
    }
}
