package com.programers.easy.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam03 {
    public static void main(String[] args) {
        int[] result = solution(3, 10);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static int[] solution2(int start, int end) {
        int[] array = IntStream.rangeClosed(start, end).toArray();
        return array;
    }
}
