package bookGreedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Adventure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] people = new int[cnt];
        for(int i = 0; i < people.length; i++){
            people[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(people);
        int i = 0;
        int result = 0;

    }
}
