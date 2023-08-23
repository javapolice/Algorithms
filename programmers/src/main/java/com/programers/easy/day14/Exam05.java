package com.programers.easy.day14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam05 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
        int[] result = solution2(arr, queries);
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
            }
        }
        return arr;
    }

    public static int[] solution2(int[] arr, int[][] queries) {
        Arrays.stream(queries).forEach(query -> IntStream.rangeClosed(query[0],query[1]).forEach(i -> arr[i]++));
        return arr;
    }
}
