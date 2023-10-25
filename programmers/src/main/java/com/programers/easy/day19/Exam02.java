package com.programers.easy.day19;

import java.util.ArrayList;

public class Exam02 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        int[] result = solution(arr);
        for (int i : result) {
            System.out.print(i  + " ");
        }
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
