package com.programers.easy.day14;


public class Exam04 {
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        int result = solution(numbers, n);
        System.out.println(result);
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if(n < answer) break;
        }
        return answer;
    }
}
