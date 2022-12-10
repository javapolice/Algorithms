package com.programers.basic.day5;

import java.util.Scanner;

public class IceAmericano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int[] result = solution(money);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] solution(int money) {
        int[] answer = new int[] {money/5500,money%5500};
        return answer;
    }
}
