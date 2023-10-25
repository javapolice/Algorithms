package com.programers.easy.day22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam04 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        int[] result = solution(arr, delete_list);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i : delete_list) {
            list.remove(Integer.valueOf(i));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
