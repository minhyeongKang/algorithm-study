package me.hellomeen;

import java.util.Arrays;

public class 삼각형의완성조건1 {

    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        삼각형의완성조건1 result = new 삼각형의완성조건1();
        int[] sides1 = {1, 2, 3};
        int[] sides2 = {3, 6, 9};
        int[] sides3 = {199, 72, 222};

        System.out.println(result.solution(sides1));
        System.out.println(result.solution(sides2));
        System.out.println(result.solution(sides3));
    }
}
