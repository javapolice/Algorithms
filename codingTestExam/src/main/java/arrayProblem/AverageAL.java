package arrayProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AverageAL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int people = Integer.parseInt(st.nextToken());
            Double[] point = new Double[people];
            double sum = 0;
            double average;
            for(int j = 0; j < point.length; j++){
                point[j] = Double.parseDouble(st.nextToken());
                sum += point[j];
            }
            average = sum/people;
            double rate = 0;
            for (Double aDouble : point) {
                if (aDouble >= average) {
                    rate++;
                }
            }
            double result = ((rate/people) * 100);
            System.out.println(Math.round(result*1000)/1000.0 + "%");
        }
    }
}
