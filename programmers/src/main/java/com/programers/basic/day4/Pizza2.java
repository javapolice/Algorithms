package com.programers.basic.day4;

import java.util.Scanner;

public class Pizza2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = solution(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        int count = 1;
        int piece = 6;
        while(piece % n != 0){
            count++;
            piece += 6;
        }
        return count;
    }
}
