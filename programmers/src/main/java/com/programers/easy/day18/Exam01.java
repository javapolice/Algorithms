package com.programers.easy.day18;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        int[] result = solution(myString);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(String myString) {
        String[] strings = myString.split("x",myString.length());
        return Arrays.stream(strings).mapToInt(s -> s.length()).toArray();
    }
}
