package com.programers.basic.day4;

import java.util.Scanner;

public class Pizza1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = solution(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        if(n % 7 != 0){
            return n / 7 + 1;
        }else{
            return n / 7;
        }
    }
}
