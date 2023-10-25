package com.programers.easy.day22;

import java.math.BigInteger;

public class Exam02 {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        String result = solution(a, b);
        System.out.println(result);
    }

    public static String solution(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);
        BigInteger add = bigInteger1.add(bigInteger2);
        return add.toString();
    }
}
