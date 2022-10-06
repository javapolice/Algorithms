package com.programers.basic.Day1;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = solution(num1, num2);
        System.out.println(result);
    }

    public static int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

}
