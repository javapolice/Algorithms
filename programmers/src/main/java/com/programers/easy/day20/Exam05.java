package com.programers.easy.day20;

import java.util.Arrays;

public class Exam05 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        int[] result = solution(num_list);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }
}
