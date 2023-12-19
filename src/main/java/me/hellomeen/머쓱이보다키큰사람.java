package me.hellomeen;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        머쓱이보다키큰사람 result = new 머쓱이보다키큰사람();
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(result.solution(array, height));
    }
}

