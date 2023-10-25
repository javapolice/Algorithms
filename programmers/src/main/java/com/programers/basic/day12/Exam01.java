package com.programers.basic.day12;

public class Exam01 {
    public static void main(String[] args) {
        String s = "bus";
        String result = solution(s);
        System.out.println(result);
    }

    public static String solution(String my_string) {
        String[] word = {"a","e","i","o","u"};
        for (String s : word) {
            my_string = my_string.replace(s,"");
        }
        return my_string;
    }
}
