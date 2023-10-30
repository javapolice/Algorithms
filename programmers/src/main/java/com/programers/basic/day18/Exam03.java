package com.programers.basic.day18;

public class Exam03 {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        int result = solution(n, t);
        System.out.println(result);
    }

    public static int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer *= 2;
        }
        return answer;
    }
}
