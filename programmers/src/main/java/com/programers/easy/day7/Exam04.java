package com.programers.easy.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam04 {
    public static void main(String[] args) {
        int n = 10;
        int[] result = solution(n);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1){
            if(n % 2 == 0){
                n /= 2;
                list.add(n);
            }else {
                n = 3 * n + 1;
                list.add(n);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
