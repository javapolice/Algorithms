package arrayProblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OXEx {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("./src/main/resources/ox1.txt");
//        BufferedReader br = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] exam = new String[cnt];
        for (int i = 0; i < exam.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            exam[i] = st.nextToken();
        }
        br.close();
        int[] result = new int[cnt];
        for (int i = 0; i < exam.length; i++) {
            String[] ox = exam[i].split("");
            int temp = 0;
            for (int j = 0; j < ox.length; j++) {
                if (ox[j].equals("O")) {
                    temp++;
                    result[i] += temp;
                } else {
                    temp = 0;
                }
            }
            System.out.println(result[i]);
        }
    }
}
