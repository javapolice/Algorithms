package com.programers.easy.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1,3},{0,4}};
        int[] result = solution(arr, intervals);
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1]; i++) {
                list.add(arr[i]);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
