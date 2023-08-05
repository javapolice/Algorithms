package com.programers.easy.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam03 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(solution(my_string,index_list));
    }

    public static String solution(String my_string, int[] index_list) {
        String answer = "";

        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        for (int i = 0; i < index_list.length; i++) {
            answer += list.get(index_list[i]);
        }

        return answer;
    }
}
