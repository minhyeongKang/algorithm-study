package me.hellomeen;

import java.util.ArrayList;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        String burger = "1231";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);
            if (sb.length() > 3 && sb.substring(sb.length()-4, sb.length()).equals(burger)) {
                answer ++;
                sb.delete(sb.length()-4, sb.length());
            }

        }

        return answer;
    }

    public int solution2(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> burger = new ArrayList<>();

        for(int i = 0; i < ingredient.length; i++){
            burger.add(ingredient[i]);
            if(burger.size() >= 4 &&
                    burger.get(burger.size()-4) == 1 &&
                    burger.get(burger.size()-3) == 2 &&
                    burger.get(burger.size()-2) == 3 &&
                    burger.get(burger.size()-1) == 1) {
                answer ++;
                for(int j = 0; j < 4; j++){
                    burger.remove(burger.size()-1);
                }
            }
        }
        return answer;
    }

    public int solution3 (int[] ingredient) {
        int answer = 0;
        int[] burger = new int[ingredient.length];
        int a = 0;

        for(int i = 0; i < ingredient.length; i++) {
            burger[a] = ingredient[i];
            a++;

            if(a >= 4 && burger[a-4] == 1 && burger[a-3] == 2 && burger[a-2] == 3 && burger[a-1] == 1) {
                answer++;
                a = a-4;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        햄버거만들기 result = new 햄버거만들기();

        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(result.solution(ingredient1)); // 2

        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(result.solution(ingredient2)); // 0
    }
}
