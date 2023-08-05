package com.programers.easy.day6;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam05 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,2}, {0,3,2}, {0,2,2}};
        int[] solution = solution(arr, queries);
        Arrays.stream(solution).forEach(System.out::println);

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = query[0]; i <= query[1]; i++) {
                if(arr[i] > query[2]) {
                    list.add(arr[i]);
                }
            }
            int min;
            if(list.isEmpty()){
                min = -1;
            }else {
                min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
            }
            result.add(min);
        }
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
