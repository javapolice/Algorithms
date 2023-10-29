package com.programers.basic.day17;

import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] result = solution(n, numlist);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}
