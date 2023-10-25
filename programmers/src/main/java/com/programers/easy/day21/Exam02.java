package com.programers.easy.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Exam02 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int result = solution(rank, attendance);
        System.out.println(result);
    }

    public static int solution(int[] rank, boolean[] attendance) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i],i);
        }

        int[] ints = IntStream.rangeClosed(1, rank.length).filter(i -> attendance[map.get(i)]).map(i->map.get(i)).limit(3).toArray();

        return ints[0] * 10000 + ints[1] * 100 + ints[2];
    }
}
