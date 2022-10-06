package com.kdm.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//1316 그룹단어체커
public class GroupWordCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < cnt; i++) {
            String s = br.readLine();
            boolean groupWord = wordCheck(s);
            if(groupWord ==  true){
                result++;
            }
        }
        System.out.println(result);
    }

    private static boolean wordCheck(String s) {
        boolean result = true;
        char[] chars = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(list.contains(chars[i]) == false){
                list.add(chars[i]);
            }else{
                int j = list.lastIndexOf(chars[i]);
                if(i-j == 1){
                    list.add(chars[i]);
                }else{
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
