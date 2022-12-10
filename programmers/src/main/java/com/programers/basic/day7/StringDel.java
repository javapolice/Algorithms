package com.programers.basic.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String letter = br.readLine();
        String result = solution(my_string,letter);
        System.out.println(result);
    }

    private static String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }
}
