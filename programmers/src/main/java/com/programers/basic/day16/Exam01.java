package com.programers.basic.day16;

public class Exam01 {
    public static void main(String[] args) {
        String message = "happy birthday!";
        int result = solution(message);
        System.out.println(result);
    }

    public static int solution(String message) {
        return message.length() * 2;
    }
}
