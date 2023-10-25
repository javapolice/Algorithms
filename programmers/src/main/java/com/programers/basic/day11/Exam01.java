package com.programers.basic.day11;

public class Exam01 {
    public static void main(String[] args) {
        int[] box = {1,1,1};
        int n = 1;
        int result = solution(box, n);
        System.out.println(result);
    }

    public static int solution(int[] box, int n) {
        int answer = 1;
        for (int i : box) {
            answer *= i / n;
        }
        return answer;
    }
}
