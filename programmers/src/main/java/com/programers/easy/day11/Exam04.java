package com.programers.easy.day11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Exam04 {
    public static void main(String[] args) {
        int[] result = solution(10, 3);
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
    }

    public static int[] solution(int start, int end) {
        int[] answer = IntStream.rangeClosed(end, start)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
