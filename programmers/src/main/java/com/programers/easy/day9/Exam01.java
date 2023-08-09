package com.programers.easy.day9;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        int[] result = solution(intStrs, k, s, l);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            String s1 = intStr.substring(s, s + l);
            if(k < Integer.parseInt(s1)) list.add(Integer.parseInt(s1));
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
