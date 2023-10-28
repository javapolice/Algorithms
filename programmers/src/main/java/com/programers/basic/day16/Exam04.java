package com.programers.basic.day16;

public class Exam04 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int result = solution(s1, s2);
        System.out.println(result);
    }

    public static int solution(String[] s1, String[] s2) {
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) count++;
            }
        }
        return count;
    }
}
