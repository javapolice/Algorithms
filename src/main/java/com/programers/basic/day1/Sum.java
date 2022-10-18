package com.programers.basic.day1;

import java.util.Scanner;

//정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = solution(num1, num2);
        System.out.println(result);
    }

    //풀이법 1 : 정수 2개 단순 더해서 리턴
    public static int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }


}
