package com.programers.easy.day5;

public class Exam01 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        System.out.println(solution(code));
    }

    public static String solution(String code) {
        String ret = "";
        char[] codes = code.toCharArray();
        int mode = 0;

        for (int i = 0; i < codes.length; i++) {
            if (mode == 0){
                if(codes[i] == '1'){
                    mode = 1;
                }else{
                    if(i % 2 == 0){
                        ret += codes[i];
                    }
                }
            }else {
                if(codes[i] == '1'){
                    mode = 0;
                }else{
                    if(i % 2 != 0){
                        ret += codes[i];
                    }
                }
            }
        }
        if(ret.isBlank()) ret = "EMPTY";
        return ret;
    }
}
