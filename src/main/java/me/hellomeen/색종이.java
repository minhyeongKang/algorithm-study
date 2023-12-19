package me.hellomeen;

import java.util.Scanner;

public class 색종이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int colorPaper = sc.nextInt();
        boolean[][] arr = new boolean[100][100];
        int area = 0;

        int amount = 0;
        while (amount < colorPaper) {
            int firstInput = sc.nextInt();
            int secondInput = sc.nextInt();

            for (int i = firstInput; i < firstInput + 10; i++) {
                for (int j = secondInput; j < secondInput + 10; j++) {
                    if (!arr[i][j]) {
                        arr[i][j] = true;
                        area++;
                    }
                }
            }
            amount++;
        }
        System.out.println(area);
    }
}
