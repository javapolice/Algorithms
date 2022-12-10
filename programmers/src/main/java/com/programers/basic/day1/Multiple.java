package com.programers.basic.day1;

import java.util.Scanner;

//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = solution(num1, num2);
        System.out.println(result);
    }

    //풀이법 1 : 정수 2개 단순 곱
    public static int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}
