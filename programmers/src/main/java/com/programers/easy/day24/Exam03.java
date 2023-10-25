package com.programers.easy.day24;

import java.util.stream.IntStream;

public class Exam03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        int[] result = solution(arr, k);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public static int[] solution(int[] arr, int k) {
        return IntStream.of(arr).map(i -> k % 2 == 0 ? i + k : i * k).toArray();
    }
}
