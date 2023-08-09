package com.programers.easy.day11;

import java.util.stream.IntStream;

public class Exam05 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        int idx = 1;
        int solution = solution2(arr, idx);
        System.out.println(solution);
    }

    public static int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static int solution2(int[] arr, int idx) {
        return IntStream.rangeClosed(idx,arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }
}
