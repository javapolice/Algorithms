package com.programers.pccp;

import java.util.HashSet;

public class exam01 {
    public static void main(String[] args) {
        System.out.println(solution("edeaaabbccd"));

    }

    public static String solution(String input_string) {
        String answer = "";
        HashSet<Character> characters = new HashSet<>();
        char[] charArray = input_string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (isTwoOver(c, charArray)) {
                if (isPart(input_string, i)) {

                }
            }

        }

        return answer;
    }

    private static boolean isPart(String s, int i) {
        char c = s.charAt(i);
        int i1 = s.indexOf(c, i + 1);
        if(i+1 < i1){
            return true;
        }else {
            return false;
        }
    }

    private static boolean isTwoOver(char c, char[] charArray) {
        int count = 0;
        for (char c1 : charArray) {
            if (c == c1){
              count += 1;
            }
            if(count >= 2){
                return true;
            }
        }
        return false;
    }
}
