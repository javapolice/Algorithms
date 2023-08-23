package com.programers.easy.day13;

import java.util.Arrays;

public class Exam03 {
    public static void main(String[] args) {
        String[] str_list = {"l"};
        String[] result = solution(str_list);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }


    public static String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")){
                answer = Arrays.copyOfRange(str_list, 0, i);
                break;
            }else if(str_list[i].equals("r")){
                answer = Arrays.copyOfRange(str_list, i+1, str_list.length);
                break;
            }
        }
        return answer;
    }
}
