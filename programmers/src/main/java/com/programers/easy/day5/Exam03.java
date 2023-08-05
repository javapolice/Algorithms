package com.programers.easy.day5;

public class Exam03 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        System.out.println(solution2(a,b,c));
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;

        if(a == b && b == c){
            // 3개 다 같을때
            answer = (int)((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)));
        } else if (a != b && a != c && b != c) {
            // 3개 다 다를떄
            answer = (a + b + c);
        }else {
            // 1만 같을때
            answer = (int)((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)));
        }
        return answer;
    }

    public static int solution2(int a, int b, int c) {
        int answer = 1;
        if(a == b && b == c){
            // 3개 다 같을때
            answer = getAnswer(a, b, c, answer, 3);
        } else if (a != b && a != c && b != c) {
            // 3개 다 다를떄
            answer = getAnswer(a, b, c, answer, 1);
        }else {
            // 1만 같을때
            answer = getAnswer(a, b, c, answer, 2);
        }
        return answer;
    }

    private static int getAnswer(int a, int b, int c, int answer, int n) {
        for (int i = 1; i <= n; i++) {
            answer *= (Math.pow(a,i) + Math.pow(b,i) + Math.pow(c,i));
        }
        return answer;
    }
}
