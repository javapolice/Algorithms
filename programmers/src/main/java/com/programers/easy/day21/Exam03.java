package com.programers.easy.day21;

public class Exam03 {
    public static void main(String[] args) {
        double flo = 1.42;
        int result = solution(flo);
        System.out.println(result);
    }

    public static int solution(double flo) {
        double answer = Math.floor(flo);
        return (int)answer;
    }
}
