package com.programers.basic.day11;

public class Exam04 {
    public static void main(String[] args) {
        int n = 3628800;
        int result = solution(n);
        System.out.println(result);
    }
    public static int solution(int n) {
        int factorial = 1;
        int answer = 1;
        while (factorial <= n){
            answer++;
            factorial *= answer;
        }
        return answer-1;
    }
}
