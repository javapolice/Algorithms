package com.programers.easy.day2;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        }else {
            System.out.println(n + " is odd");
        }
    }
}
