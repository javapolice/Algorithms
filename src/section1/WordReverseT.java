package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReverseT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] str = new String[n];
        for(int i= 0; i < n; i++){
            str[i] = scn.next();
        }
        for(String x : solution2(n, str)){
            System.out.println(x);
        }
    }

    private static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    private static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String s = String.valueOf(c);
            answer.add(s);
        }
        return answer;
    }
}
