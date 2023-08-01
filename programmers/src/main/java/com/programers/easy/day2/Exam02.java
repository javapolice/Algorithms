package com.programers.easy.day2;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArray = a.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
