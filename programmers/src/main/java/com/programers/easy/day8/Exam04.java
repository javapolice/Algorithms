package com.programers.easy.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam04 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        System.out.println(solution(number));
    }

    public static int solution(String number) {
        int answer = 0;

        List<String> list = Arrays.stream(number.split("")).collect(Collectors.toList());
        for (String s : list) {
            answer += Integer.parseInt(s);
        }
        answer %= 9;

        return answer;
    }
}
