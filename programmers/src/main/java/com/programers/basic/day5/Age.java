package com.programers.basic.day5;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int result = solution(age);
        System.out.println(result);
    }

    private static int solution(int age) {
        int year = 2022;
        return year-age+1;
    }

}
