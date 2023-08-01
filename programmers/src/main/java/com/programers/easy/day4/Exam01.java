package com.programers.easy.day4;

public class Exam01 {
    public static void main(String[] args) {
        System.out.println(solution(98,2));
    }

    public static int solution(int num, int n) {
        int answer = 0;

        if(num % n == 0){
            answer =1;
        }
        return answer;
    }
}
