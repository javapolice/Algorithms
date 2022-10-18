package com.programers.basic.day1;

import java.util.Scanner;

//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = solution(num1, num2);
        System.out.println(result);
    }

    //풀이법 1 : 정수 2개 단순 나누기 몫
    public static int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

}
