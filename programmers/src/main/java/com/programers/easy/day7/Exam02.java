package com.programers.easy.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        int[] result = solution(l, r);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            boolean check = true;
            String[] strings = String.valueOf(i).split("");


            for (String s : strings) {
                if(s.equals("5") || s.equals("0")) {
                    continue;
                }else{
                    check = false;
                    break;
                }
            }
            if(check) list.add(i);
        }

        if(list.isEmpty()){
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
