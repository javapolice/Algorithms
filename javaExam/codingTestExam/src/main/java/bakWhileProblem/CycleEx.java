package bakWhileProblem;

import java.io.*;

public class CycleEx {
    public static void main(String[] args) throws IOException {
        //초기작업
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //변수설정
        int T = Integer.parseInt(br.readLine());
        int copy = T;
        int count = 0;
        do {
            T = (T % 10) * 10 + (T / 10 + T % 10) % 10;
            count++;
        } while (copy != T);
        bw.write(count + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
