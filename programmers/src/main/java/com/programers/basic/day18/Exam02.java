package com.programers.basic.day18;

public class Exam02 {
    public static void main(String[] args) {
        int n = 144;
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
