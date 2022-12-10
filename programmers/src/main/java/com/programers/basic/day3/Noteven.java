package com.programers.basic.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Noteven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();
        int[] answer = solution(num);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static int[] solution(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if(i % 2 != 0){
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
