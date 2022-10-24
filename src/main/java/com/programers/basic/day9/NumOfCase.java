package com.programers.basic.day9;

import java.util.Scanner;

public class NumOfCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balls = sc.nextInt();
        int share = sc.nextInt();
        int result = solution(balls,share);
        System.out.println(result);
    }

    private static int solution(int balls, int share) {
        int n = calPacto(balls);
        int m = calPacto(share);
        int nMinusM = calPacto(balls-share);
        int answer = n / (nMinusM * m);
        return answer;
    }

    private static int calPacto(int range) {
        int result = 1;
        for (int i = 1; i <= range; i++) {
            result *=i;
        }
        return result;
    }
}
