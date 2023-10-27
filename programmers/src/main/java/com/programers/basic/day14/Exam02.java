package com.programers.basic.day14;

public class Exam02 {
    public static void main(String[] args) {
        int order = 29423;
        int result = solution(order);
        System.out.println(result);
    }

    public static int solution(int order) {
        int answer = 0;
        String[] strings = String.valueOf(order).split("");
        for (String s : strings) {
            if(s.equals("3") || s.equals("6") || s.equals("9")) answer++;
        }
        return answer;
    }
}
