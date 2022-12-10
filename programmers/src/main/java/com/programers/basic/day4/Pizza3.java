package com.programers.basic.day4;

import java.util.Scanner;

public class Pizza3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int slice = scn.nextInt();
        int n = scn.nextInt();
        int result = solution(slice,n);
        System.out.println(result);
    }

    private static int solution(int slice, int n) {
        if(n % slice != 0){
            return n / slice + 1;
        }else{
            return n / slice;
        }
    }
}
