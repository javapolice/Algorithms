package com.programers.easy.day9;

import java.util.*;
import java.util.stream.*;

public class Exam02 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        String solution = solution(my_strings, parts);
        System.out.println(solution);
    }

    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        List<int[]> intList = Arrays.stream(parts).collect(Collectors.toList());

        for (int i = 0; i < my_strings.length; i++) {
            int[] ints = intList.get(i);
            String s = my_strings[i].substring(ints[0], ints[1] + 1);
            answer += s;
        }

        return answer;
    }
}
