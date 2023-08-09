package com.programers.easy.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Exam04 {
    public static void main(String[] args) {
        String s = "banana";
        String[] result = solution(s);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static String[] solution(String my_string) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(i);
            list.add(s);
        }
        list.sort(Comparator.naturalOrder());

        String[] answer = list.toArray(new String[0]);

        return answer;
    }
}
