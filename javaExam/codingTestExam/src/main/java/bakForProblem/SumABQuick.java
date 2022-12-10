package bakForProblem;

import java.io.*;
import java.util.StringTokenizer;

public class SumABQuick {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("C:\\intelliJ\\codingTestExam\\src\\main\\resources\\sumABQ.txt");
//        BufferedReader br = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(A + B));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
