package com.programers.basic.day7;


import java.util.Scanner;

public class LambSkewers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = solution(n,k);
        System.out.println(result);
    }

    private static int solution(int n, int k) {
        final int LAMB_PRICE = 12000;
        final int DRINK_PRICE = 2000;

        int lambTot = LAMB_PRICE * n;
        int drinkTot = DRINK_PRICE * (k - n/10);

        return lambTot + drinkTot;
    }

}
