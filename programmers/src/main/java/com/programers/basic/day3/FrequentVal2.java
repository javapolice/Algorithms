package com.programers.basic.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class FrequentVal2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] ints = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int result = solution(ints);
        System.out.println(result);
    }

    private static int solution(int[] ints) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i : ints) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        if(list.size() > 1){
            if(list.get(0).getValue() == list.get(1).getValue()) return -1;
        }

        return list.get(0).getKey();
    }
}
