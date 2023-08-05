package com.programers.easy.day6;

import java.util.Arrays;

public class Exam04 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,3}, {1,2}, {1,4}};

        Arrays.stream(solution(arr, queries)).forEach(System.out::println);
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int[] query : queries) {
            int firstVal = arr[query[0]];
            int lastVal = arr[query[1]];
            arr[query[0]] = lastVal;
            arr[query[1]] = firstVal;
        }

        answer = arr;
        return answer;
    }
}
