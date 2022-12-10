package section2;

import java.util.Scanner;

/*
2. 보이는 학생
설명

선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


출력
선생님이 볼 수 있는 최대학생수를 출력한다.


예시 입력 1

8
130 135 148 140 145 150 150 153
예시 출력 1

5
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] students = new int[n];
        for(int i = 0; i < n; i++){
            students[i] = scanner.nextInt();
        }
        int result = solution(n,students);
        System.out.println(result);
    }

    private static int solution(int n, int[] students) {
        int result = 1;
        int tmp = students[0];
        for(int i = 1; i < n; i++){
            if(students[i] > tmp){
                result++;
                tmp = students[i];
            }
        }
        return result;
    }
}
