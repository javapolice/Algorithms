package com.programers.basic.day12;

import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        String s = "hi12392";
        int[] result = solution(s);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("\\D","");
        return Arrays.stream(my_string.split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}
