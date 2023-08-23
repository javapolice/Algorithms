package com.programers.easy.day17;

public class Exam04 {
    public static void main(String[] args) {
        String my_string = "i love you";
        String[] result = solution(my_string);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
