package com.programers.basic.day17;

public class Exam01 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int result = solution(num, k);
        System.out.println(result);
    }

    public static int solution(int num, int k) {
        String s = String.valueOf(num);
        int i = s.indexOf(String.valueOf(k));
        if(i != -1) i++;
        return i;
    }
}
