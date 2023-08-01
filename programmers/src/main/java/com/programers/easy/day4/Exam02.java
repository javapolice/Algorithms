package com.programers.easy.day4;

public class Exam02 {
    public static void main(String[] args) {
        System.out.println(solution(60,2,3));
    }

    public static int solution(int number, int n, int m) {
        int answer = 0;

        if(number % n == 0 && number % m == 0) answer = 1;

        return answer;
    }
}
