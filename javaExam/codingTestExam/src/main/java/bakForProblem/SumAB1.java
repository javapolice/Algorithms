package bakForProblem;

import java.io.*;
import java.util.StringTokenizer;

public class SumAB1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./src/main/resources/sumAB1.txt");
        BufferedReader br = new BufferedReader(fr);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int sum = num1 + num2;
            bw.write("Case #" + (i + 1) + ": " + sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
