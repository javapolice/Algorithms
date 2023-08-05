package com.programers.easy.day7;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};
        int[] result = solution(arr, queries);

        Arrays.stream(result).forEach(System.out::println);

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if(i % query[2] == 0){
                    arr[i]++;
                }
            }
        }

        answer = arr;

        return answer;
    }
}
