package com.programers.easy.day22;

public class Exam05 {
    public static void main(String[] args) {
        String my_string= "banana";
        String target = "ana";
        int result = solution(my_string, target);
        System.out.println(result);
    }

    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
