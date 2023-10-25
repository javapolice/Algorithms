package com.programers.skillck.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,3};
        int[] reserve = {2};
        int result = solution(n, lost, reserve);
        System.out.println(result);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for (Integer i : lostList) {
            if(reserveList.contains(i)){
                reserveList.remove(i);
                lostList.remove(i);
            }
        }

        for (Integer integer : lostList) {
            if(reserveList.contains(integer - 1)){
                reserveList.remove(Integer.valueOf(integer - 1));
            }else if (reserveList.contains(integer + 1)){
                reserveList.remove(Integer.valueOf(integer + 1));
            }else{
                answer -= 1;
            }
        }

        return answer;
    }
}
