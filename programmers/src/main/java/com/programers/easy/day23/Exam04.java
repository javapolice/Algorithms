package com.programers.easy.day23;

public class Exam04 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int result = solution(a, b);
        System.out.println(result);
    }

    public static int solution(int a, int b) {
        int answer;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = (int)Math.pow(a,2) + (int)Math.pow(b,2);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        }else{
            answer = 2 * (a + b);
        }
        return answer;
    }
}
