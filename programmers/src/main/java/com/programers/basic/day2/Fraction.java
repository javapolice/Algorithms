package com.programers.basic.day2;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denum1 = sc.nextInt();
        int num1 = sc.nextInt();
        int denum2 = sc.nextInt();
        int num2 = sc.nextInt();


        int[] result = solution(denum1, num1, denum2, num2);
        for (int i : result) {
            System.out.println(i);
        }

    }

    private static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        //통분 공식
        int x = denum1 * num2 + denum2 * num1;
        int y = num1 * num2;

        //최대공약수(유클리드호제법)
        int gcd = uclid(x, y);

        answer[0] = x / gcd;
        answer[1] = y / gcd;
        return answer;
    }

    private static int uclid(int x, int y) {
        int r = x % y;
        if(r == 0){
            return y;
        }
        return uclid(y,r);
    }
}
