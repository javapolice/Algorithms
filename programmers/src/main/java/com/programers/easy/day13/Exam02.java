package com.programers.easy.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam02 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] result = solution(num_list, n);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(int[] num_list, int n) {
        int[] ints1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] ints2 = Arrays.copyOfRange(num_list, 0, n);
        int[] answer = IntStream.concat(Arrays.stream(ints1), Arrays.stream(ints2)).toArray();

        return answer;
    }
}
