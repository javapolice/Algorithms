package com.programers.easy.day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam03 {
    public static void main(String[] args) {
        String s = "apporoograpemmemprs";
        int[] ints = {1, 16, 6, 15, 0, 10, 11, 3};
        String solution = solution(s, ints);
        System.out.println(solution);
    }

    public static String solution(String my_string, int[] indices) {

        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        for (int index : indices) {
            list.set(index,"");
        }

        String answer = list.stream().collect(Collectors.joining());

        return answer;
    }
}
