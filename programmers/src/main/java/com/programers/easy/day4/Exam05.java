package com.programers.easy.day4;

public class Exam05 {
    public static void main(String[] args) {
        System.out.println(solution(-4,7,false));
    }

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag){
            answer = a + b;
        }else {
            answer = a - b;
        }

        return answer;
    }
}
