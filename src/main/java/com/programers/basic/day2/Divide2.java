package com.programers.basic.day2;

import java.util.Scanner;

public class Divide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = solution(num1, num2);
        System.out.println(result);

    }

    private static int solution(int num1, int num2) {
        double answer = 0;
        answer =  (double) num1 / num2;
        answer = answer * 1000;
        return (int) answer;
    }
}
