package com.programers.easy.day14;


public class Exam01 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int result = solution(num_list);
        System.out.print(result);
    }

    public static int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if((i+1) % 2 == 0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        return (odd > even) ? odd : even;
    }
}
