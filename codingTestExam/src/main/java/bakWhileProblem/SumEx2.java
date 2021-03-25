package bakWhileProblem;

import java.io.*;
import java.util.StringTokenizer;

public class SumEx2 {
    public static void main(String[] args) throws IOException {
        //기초작업
        /*FileReader fr = new FileReader("./src/main/resources/sumEx2.txt");
        BufferedReader br = new BufferedReader(fr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //변수설정
        int a = 0;
        int b = 0;
        int sum = 0;
        //계산
        while (br.ready()) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a + b;
            bw.write(sum + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
