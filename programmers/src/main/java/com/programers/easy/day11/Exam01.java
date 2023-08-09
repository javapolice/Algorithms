package com.programers.easy.day11;

import java.util.Arrays;
import java.util.HashMap;

public class Exam01 {
    public static void main(String[] args) {
        String my_string = "Programmers";
        int[] result = solution(my_string);
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
    }

    public static int[] solution(String my_string) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 65; i <= 90; i++) {
            String temp = String.valueOf((char) i);
            hashMap.put(temp,0);
        }
        for (int i = 97; i <= 122; i++) {
            String temp = String.valueOf((char) i);
            hashMap.put(temp,0);
        }

        for (String s : my_string.split("")) {
            Integer temp = hashMap.get(s) + 1;
            hashMap.replace(s,temp);
        }

        int[] answer = hashMap.values().stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
