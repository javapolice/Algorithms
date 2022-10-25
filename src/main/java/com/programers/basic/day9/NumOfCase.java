package com.programers.basic.day9;

import java.math.BigInteger;
import java.util.Scanner;

public class NumOfCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balls = sc.nextInt();
        int share = sc.nextInt();
        int result = solution(balls,share);
        System.out.println(result);
    }

    private static int solution(int balls, int share) {
        BigInteger n = calPacto(BigInteger.valueOf(balls));
        BigInteger m = calPacto(BigInteger.valueOf(share));
        BigInteger x = calPacto(BigInteger.valueOf(balls-share));
        return Integer.parseInt(String.valueOf(n.divide(x.multiply(m))));
    }

    /*private static BigInteger calPacto(BigInteger range) {
        if(range.equals(BigInteger.ONE)) return range;
        return range.multiply(calPacto(range.subtract(BigInteger.ONE)));
    }*/

    private static BigInteger calPacto(BigInteger range) {
        BigInteger a = BigInteger.ONE;
        int r = Integer.parseInt(String.valueOf(range));
        for (int i = r; i >= 2; i--) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        return a;
    }
}
