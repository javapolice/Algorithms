package com.programers.easy.day20;

import java.util.*;


public class Exam03 {
    public static void main(String[] args) {
        String[] arr = {"a","bc","d","efg","hi"};
        int result = solution(arr);
        System.out.println(result);
    }

    public static int solution(String[] strArr) {
        int[] arr = Arrays.stream(strArr).mapToInt(s -> s.length()).toArray();

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            if(!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
        int max = Collections.max(map.values()).intValue();
//        map.entrySet().stream().max(Comparator.comparingInt(entry -> entry.getValue())).get().getValue().intValue();
        return max;
    }
}
