package com.programers.basic.day15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exam02 {
    public static void main(String[] args) {
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        String result = solution2(my_string, num1, num2);
        System.out.println(result);
    }

    public static String solution(String my_string, int num1, int num2) {
        String[] strings = my_string.split("");
        String temp = strings[num1];
        strings[num1] = strings[num2];
        strings[num2] = temp;
        return Arrays.stream(strings).collect(Collectors.joining());
    }

    public static String solution2(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list,num1,num2);
        return list.stream().collect(Collectors.joining());
    }
}
