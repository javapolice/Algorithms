package section2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
6. 뒤집은 소수
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1

9
32 55 62 20 250 370 200 30 100
예시 출력 1

23 2 73 2 3
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();
        int[] ints = new int[cnt];
        for(int i =0; i < ints.length; i++){
            ints[i]= scn.nextInt();
        }
        Date date = new Date();
        for (int i : solution2(ints)) {
            System.out.print(i + " ");
        }
        System.out.println();
        Date date2 = new Date();
        System.out.println((date2.getTime() - date.getTime()));
    }

    private static List<Integer> solution(int[] ints) {
        List<Integer> list = new ArrayList<>();
        for (int anInt : ints) {
            int tmp = Integer.parseInt(new StringBuilder().append(anInt).reverse().toString());
            boolean b = primeCheck(tmp);
            if(b == true) list.add(tmp);
        }
        return list;
    }

    private static List<Integer> solution2(int[] ints) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            int tmp = ints[i];
            int res = 0;
            while (tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if(primeCheck(res) == true) list.add(res);
        }
        return list;
    }

    private static boolean primeCheck(int tmp) {
        if(tmp == 0 || tmp == 1) return false;
        else{
            for(int i = 2; i < tmp; i++){
                if(tmp % i == 0)return false;
            }
            return true;
        }
    }
}
