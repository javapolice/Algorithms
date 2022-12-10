package com.programers.basic.day8;

import java.util.Scanner;
import java.util.stream.Collectors;

//입문 lv.0 외계행성의 나이
public class PlanetAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String result = solution(age);
        System.out.println(result);
    }

    private static String solution(int age) {
        String[] split = String.valueOf(age).split("");
        String answer = "";
        for (String s : split) {
            int i = 97 + Integer.parseInt(s);
            char c = (char) i;
            answer += String.valueOf(c);
        }
        return answer;
    }

    public static String solution2(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}
