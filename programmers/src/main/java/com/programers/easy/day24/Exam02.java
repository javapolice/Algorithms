package com.programers.easy.day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam02 {
    public static void main(String[] args) {
        String[] picture = {"x.x", ".x.", "x.x"};
        int k = 3;
        String[] result = solution(picture, k);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] picture, int k) {
        String[] array = Arrays.stream(picture).map(s -> Arrays.stream(s.split("")).map(s1 -> s1.repeat(k)).collect(Collectors.joining())).toArray(String[]::new);
        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            for (int i = 0; i < k; i++) {
                list.add(s);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}
