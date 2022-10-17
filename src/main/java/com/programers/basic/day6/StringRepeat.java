package com.programers.basic.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String result = solution(my_string, n);
        System.out.println(result);
    }

    private static String solution(String my_string, int n) {
        String[] split = my_string.split("");
        String answer = "";
        for (String s : split) {
            answer+= s.repeat(n);
        }
        return answer;
    }

}
