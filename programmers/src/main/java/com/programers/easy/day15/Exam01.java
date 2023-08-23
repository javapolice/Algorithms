package com.programers.easy.day15;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] result = solution(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr).map(i -> {
            if (i >= 50 && i % 2 == 0) {
                return i / 2;
            } else if (i < 50 && i % 2 != 0) {
                return i * 2;
            }else{
                return i;
            }
        }).toArray();

        return answer;
    }
}
