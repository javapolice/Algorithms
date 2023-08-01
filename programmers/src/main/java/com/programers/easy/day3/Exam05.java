package com.programers.easy.day3;

public class Exam05 {
    public static void main(String[] args) {
        System.out.println(solution(91,2));
    }

    public static int solution(int a, int b) {
        int answer = 0;
        int sample1 = Integer.parseInt(a + "" + b);
        int sample2 = 2 * a * b;
        answer = Math.max(sample1, sample2);
        return answer;
    }
}
