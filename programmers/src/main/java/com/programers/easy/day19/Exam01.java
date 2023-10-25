package com.programers.easy.day19;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";
        String[] result = solution2(myStr);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String myStr) {
        String[] answer = {"EMPTY"};

        myStr = myStr.replaceAll("[a-c]","1");
        String[] array = Arrays.stream(myStr.split("1")).filter(s -> !s.isEmpty()).toArray(String[]::new);

        if(array.length > 0){
            return array;
        }else {
            return answer;
        }
    }

    public static String[] solution2(String myStr) {
        String[] answer = {"EMPTY"};

        String[] array = Arrays.stream(myStr.split("[a-c]")).filter(s -> !s.isEmpty()).toArray(String[]::new);

        return array.length > 0 ? array : answer;
    }
}
