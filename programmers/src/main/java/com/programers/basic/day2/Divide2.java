package com.programers.basic.day2;

import java.util.Scanner;

//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
public class Divide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = solution(num1, num2);
        System.out.println(result);

    }

    //풀이법 1 : 정수 2개 나누고 몫에 1000 곱하기 (형변환이용 Double)
    //형변환 사용 이유 : 소수점까지 표현하기 위해.
    private static int solution(int num1, int num2) {
        double answer = 0;
        answer =  (double) num1 / num2;
        answer = answer * 1000;
        return (int) answer;
    }
}
