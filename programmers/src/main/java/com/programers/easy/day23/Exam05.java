package com.programers.easy.day23;

import java.time.LocalDate;

public class Exam05 {
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        int result = solution(date1, date2);
        System.out.println(result);

    }

    public static int solution(int[] date1, int[] date2) {
        LocalDate ld1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate ld2 = LocalDate.of(date2[0], date2[1], date2[2]);
        return ld1.compareTo(ld2) < 0 ? 1 : 0;
    }
}
