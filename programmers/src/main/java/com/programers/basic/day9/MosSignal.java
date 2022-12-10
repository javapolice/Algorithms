package com.programers.basic.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MosSignal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letter = br.readLine();
        String result = solution(letter);
        System.out.println(result);
    }

    private static String solution(String letter) {
        Map<String, String> mossmap = new HashMap<>();
        makeMossmap(mossmap);

        StringTokenizer st = new StringTokenizer(letter," ");
        String result = "";
        while(st.hasMoreTokens()){
            result += mossmap.get(st.nextToken());
        }
        return result;
    }

    private static void makeMossmap(Map<String, String> mossmap) {
        String mos = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f', '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l', '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r', '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x', '-.--':'y','--..':'z'";
        String[] moss = mos.replaceAll(" ", "").split(",");
        for (String s : moss) {
            String[] split = s.replaceAll("\\'", "").split("\\:");
            mossmap.put(split[0],split[1]);
        }
    }
}
