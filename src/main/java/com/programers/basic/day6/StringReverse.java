package com.programers.basic.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String answer = solution2(my_string);
        System.out.println(answer);


    }

    private static String solution(String my_string) {
        String[] s = my_string.split("");
        List<String> collect = Arrays.stream(s).collect(Collectors.toList());
        Collections.reverse(collect);

        String answer = "";
        for (String s1 : collect) {
            answer += s1;
        }
        return answer;
    }

    public static String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
