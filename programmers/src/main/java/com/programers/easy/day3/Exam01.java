package com.programers.easy.day3;

import java.util.Arrays;
import java.util.List;

public class Exam01 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        String result = solution(str1, str2);

        System.out.println(result);
    }

    public static String solution(String str1, String str2) {
        String answer = "";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            answer+= chars1[i];
            answer+= chars2[i];
        }
        return answer;
    }
}
