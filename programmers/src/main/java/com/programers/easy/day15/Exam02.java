package com.programers.easy.day15;

import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int result = solution(arr);
        System.out.println(result);
    }

    public static int solution(int[] arr) {
        int cnt = 0;
        boolean pass;

        do{
            int[] beforeArr = Arrays.copyOf(arr, arr.length);
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i]/=2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            cnt++;

            pass = true;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != beforeArr[i]){
                    pass = false;
                    break;
                }
            }
        }while(pass == false);

        return cnt - 1;
    }
}
