package me.hellomeen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 택배기사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int visitHome = 0;
        int[] visitedHomes = new int[101];

        for (int i = 0; i < input; i++) {
            int home = sc.nextInt();
            if (visitedHomes[home] == 0) {
                visitedHomes[home] = 1;
                visitHome++;
            }
        }

        System.out.println(visitHome);
    }
}
