package com.programers.easy.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam01 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;
        int[] result = solution(num_list, n);
        Arrays.stream(result).forEach(System.out::println);

    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = IntStream.range(n - 1, num_list.length).map(i -> num_list[i]).toArray();
        return answer;
    }
}
