package com.programers.easy.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exam05 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(my_string, queries));
    }

    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        for (int[] query : queries) {
            Collections.reverse(list.subList(query[0],query[1]+1));
        }

        answer = list.stream().collect(Collectors.joining());

        return answer;
    }
}
