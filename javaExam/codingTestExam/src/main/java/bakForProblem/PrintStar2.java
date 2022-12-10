package bakForProblem;

import java.io.*;

public class PrintStar2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= cnt; i++){
            for(int j = 0; j < cnt-i ; j++){
                bw.write(" ");
            }
            for(int k = 0; k < i; k++){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
