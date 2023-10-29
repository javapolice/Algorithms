package com.programers.basic.day17;

import java.util.ArrayList;

public class Exam04 {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] result = solution(quiz);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : quiz) {
            String[] strings = s.split(" ");
            int i = 0;
            if (strings[1].equals("+")) {
                i = Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]);
            }else{
                i = Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]);
            }
            if(i == Integer.parseInt(strings[4])){
                list.add("O");
            }else {
                list.add("X");
            }
        }
        return list.stream().toArray(String[]::new);
    }
}
