package com.programers.easy.day14;

import java.util.stream.IntStream;

public class Exam02 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] result = solution(names);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
    public static String[] solution(String[] names) {
        return IntStream.range(0, names.length).filter(i -> i % 5 == 0).mapToObj(i -> names[i]).toArray(String[]::new);
    }
}
