package com.programers.basic.day6;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        solution2(i);
    }

    private static void solution(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void solution2(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println("*".repeat(j));
        }
    }
}
