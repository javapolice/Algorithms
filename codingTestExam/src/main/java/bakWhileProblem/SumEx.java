package bakWhileProblem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SumEx {
    public static void main(String[] args) throws IOException {
        //초기작업
        /*FileReader fr = new FileReader("./src/main/resources/sumEx.txt");
        BufferedReader br = new BufferedReader(fr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //변수 설정
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        int count = 0;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            num1.add(a);
            num2.add(b);
            if (a == 0 && b == 0) {
                break;
            }
        }
        //계산
/*
        for (int i = 0; i < num1.size(); i++) {
            if (num1.get(i) == 0 && num2.get(i) == 0) {
                break;
            } else {
                bw.write((num1.get(i) + num2.get(i)) + "\n");
            }
        }
*/
        while (num1.get(count) != null) {
            if (num1.get(count) == 0 && num2.get(count) == 0) {
                break;
            } else {
                bw.write((num1.get(count) + num2.get(count)) + "\n");
                count++;
            }
        }
        //출력
        br.close();
        bw.flush();
        bw.close();
    }
}
