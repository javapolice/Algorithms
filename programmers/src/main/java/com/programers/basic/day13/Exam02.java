package com.programers.basic.day13;

import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        int[] result = solution(strlist);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).map(s -> s.length()).mapToInt(Integer::intValue).toArray();
    }
}
