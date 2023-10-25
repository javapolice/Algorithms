package com.programers.basic.day13;

public class Exam01 {
    public static void main(String[] args) {
        String s = "0 Z 20 Z 1";
        int result = solution(s);
        System.out.println(result);
    }

    private static int solution(String s) {
        int result = 0;
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("Z")) {
                result -= Integer.parseInt(strings[i-1]);
            }else {
                result += Integer.parseInt(strings[i]);
            }
        }
        return result;
    }


}
