package bakForProblem;

import java.io.*;
import java.util.StringTokenizer;

public class SumAB2 {
    public static void main(String[] args) throws IOException {
        /*FileReader fr = new FileReader("C:\\intelliJ\\codingTestExam\\src\\main\\resources\\sumAB2.txt");
        BufferedReader br = new BufferedReader(fr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 1; i <= cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
