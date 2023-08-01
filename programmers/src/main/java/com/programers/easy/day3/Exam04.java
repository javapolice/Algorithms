package com.programers.easy.day3;

public class Exam04 {
    public static void main(String[] args) {
        System.out.println(solution(9,91));
    }

    public static int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a).concat(String.valueOf(b));
        String ba = String.valueOf(b).concat(String.valueOf(a));

        if(Integer.parseInt(ab) >= Integer.parseInt(ba)){
            answer = Integer.parseInt(ab);
        }else {
            answer = Integer.parseInt(ba);
        }

        return answer;
    }
}
