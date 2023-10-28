package com.programers.basic.day16;

import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        int[] result = solution(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] array) {
        int index = 0;
        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if(max == array[i]){
                index = i;
            }
        }
        return new int[]{max,index};
    }
}
