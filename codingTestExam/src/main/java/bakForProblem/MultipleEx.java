package bakForProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + number * (i + 1));
        }
    }
}
