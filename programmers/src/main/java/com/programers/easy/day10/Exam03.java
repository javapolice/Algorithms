package com.programers.easy.day10;

import java.util.*;
import java.util.stream.Collectors;

public class Exam03 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        String result = solution(my_string, s, e);
        System.out.println(result);

    }

    public static String solution(String my_string, int s, int e) {
        String answer = "";

        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.reverse(list.subList(s,e+1));

        answer = list.stream().collect(Collectors.joining());

        return answer;
    }
}
