package com.programers.easy.day12;

import java.util.ArrayList;

public class Exam01 {
    public static void main(String[] args) {
        int n = 4;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = solution(n, slicer, num_list);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();

        switch (n) {
            case 1:
                for (int i = 0; i <= slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = slicer[0]; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    list.add(num_list[i]);
                }
                break;
            default:
                break;
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
