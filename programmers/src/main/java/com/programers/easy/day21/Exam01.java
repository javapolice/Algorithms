package com.programers.easy.day21;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam01 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] result = solution(num_list);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] num_list) {
        int[] sortedArr = Arrays.stream(num_list).sorted().toArray();
        return IntStream.range(5, sortedArr.length).map(i -> sortedArr[i]).toArray();
    }
}
