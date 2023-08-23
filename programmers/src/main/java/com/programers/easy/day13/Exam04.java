package com.programers.easy.day13;

import java.util.Arrays;

public class Exam04 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] result = solution(num_list, n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
