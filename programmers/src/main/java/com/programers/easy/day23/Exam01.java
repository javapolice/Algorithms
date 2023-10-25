package com.programers.easy.day23;

public class Exam01 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";
        int result = solution(str1, str2);
        System.out.println(result);
    }
    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
