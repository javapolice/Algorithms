package arrayProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Double[] point = new Double[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < point.length; i++) {
            point[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(point, Collections.reverseOrder());
        Double maxPoint = point[0];
        double result = 0;
        for (int i = 0; i < point.length; i++) {
            result += (point[i] / maxPoint) * 100;
        }
        System.out.println(result / cnt);
    }
}
