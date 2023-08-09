package com.programers.easy.day9;

import java.util.ArrayList;

public class Exam05 {
    public static void main(String[] args) {
        String s = "banana";
        String is_suffix = "ana";

        int result = solution(s, is_suffix);
        System.out.println(result);

    }

    public static int solution(String my_string, String is_suffix) {
        int answer = 0;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(i);
            list.add(s);
        }

        int i = list.contains(is_suffix) ? 1 : 0;
        answer = i;
        return answer;
    }
}
