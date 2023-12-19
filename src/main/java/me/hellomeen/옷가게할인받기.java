package me.hellomeen;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = 0;

        if (price >= 500000) {
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        } else {
            answer = price;
        }

        return answer;
    }

    public static void main(String[] args) {
        옷가게할인받기 result = new 옷가게할인받기();
        int price1 = 50000;
        int price2 = 150000;
        int price3 = 350000;
        int price4 = 580000;

        System.out.println(result.solution(price1));
        System.out.println(result.solution(price2));
        System.out.println(result.solution(price3));
        System.out.println(result.solution(price4));
    }
}
