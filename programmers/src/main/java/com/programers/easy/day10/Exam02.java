package com.programers.easy.day10;

import java.util.ArrayList;

public class Exam02 {
    public static void main(String[] args) {
        String s = "banana";
        String is_prefix = "ban";
        int result = solution(s, is_prefix);
        System.out.println(result);
    }

    public static int solution(String my_string, String is_prefix) {
        int answer = 0;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(0, i+1);
            list.add(s);
        }

        if(list.contains(is_prefix)) answer = 1;

        return answer;
    }
}
