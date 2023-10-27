package com.programers.basic.day15;

import java.util.HashMap;
import java.util.Map;

public class Exam01 {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        long result = solution(numbers);
        System.out.println(result);

    }

    public static long solution(String numbers) {
        Map<String, String> map = makeNumberMap();
        for (String s : map.keySet()) {
            if(numbers.contains(s)){
                numbers = numbers.replace(s,map.get(s));
            }
        }
        return Long.parseLong(numbers);
    }

    private static Map<String,String> makeNumberMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        return map;
    }

}
