package com.programers.easy.day8;

import java.util.Arrays;
import java.util.HashMap;

public class Exam02 {
    public static void main(String[] args) {
        System.out.println(solution(2,2,2,2));
        System.out.println(solution(4,1,4,4));
        System.out.println(solution(6,3,3,6));
        System.out.println(solution(2,5,2,6));
        System.out.println(solution(6,4,2,5));

    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dices = {a, b, c, d};
        int[] counts = new int[dices.length];

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < dices.length; j++) {
                if(dices[i] == dices[j]) counts[i]++;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < counts.length; i++) {
            map.put(counts[i],dices[i]);
        }

        //1.4444, 2.3133, 3.2222, 4.2121, 5.1111

        int cases = 0;
        int twos = 0;
        for (int count : counts) {
            if(count == 4){
                cases = 1;
                break;
            } else if (count == 3) {
                cases = 2;
                break;
            } else {
                if(count == 2) twos++;
            }
        }

        if(cases == 0){
            if(twos == 4){
                cases = 3;
            } else if(twos == 2){
                cases = 4;
            }else if(twos == 0){
                cases = 5;
            }else{
                cases = 0;
            }
        }

        //1.4444, 2.3133, 3.2222, 4.2121, 5.1111
        switch (cases){
            case 1 :
                answer = 1111 * map.get(4);
                break;
            case 2 :
                answer = (int) Math.pow((10 * map.get(3) + map.get(1)), 2);
                break;
            case 3 :
                for (int dice : dices) {
                    if(a != dice) {
                        answer = (a + dice) * Math.abs(a - dice);
                        break;
                    }
                }
                break;
            case 4 :
                answer += 1;
                for (int dice : dices) {
                    if(map.get(2) != dice) answer *= dice;
                }
                break;
            case 5 :
                answer = Arrays.stream(dices).min().getAsInt();
                break;
            default:
                answer = 0;
        }
        return answer;
    }
}
