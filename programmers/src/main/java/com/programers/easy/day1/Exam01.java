package com.programers.easy.day1;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        char[] charArray = a.toCharArray();
        for (char c : charArray) {
            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            }else{
                result += Character.toUpperCase(c);
            }
        }
        System.out.println(result);
    }
}
