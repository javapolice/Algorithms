package com.programers.basic.day13;

import java.util.Arrays;

public class Exam04 {
    public static void main(String[] args) {
        int[] sides = {199, 72, 222};
        int result = solution(sides);
        System.out.println(result);
    }

    public static int solution(int[] sides) {
        int[] sortSides = Arrays.stream(sides).sorted().toArray();
        if(sortSides[0] + sortSides[1] > sortSides[2]){
            return 1;
        }else {
            return 2;
        }
    }
}
