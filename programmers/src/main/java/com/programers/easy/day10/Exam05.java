package com.programers.easy.day10;

public class Exam05 {
    public static void main(String[] args) {
        String code = "qjnwezgrpirldywt";
        String result = solution(3, 1, code);
        System.out.println(result);

    }
    public static String solution(int q, int r, String code) {
        String answer = "";

        String[] codes = code.split("");

        for (int i = 0; i < codes.length; i++) {
            if(i % q == r){
                answer += codes[i];
            }
        }

        return answer;
    }

}
