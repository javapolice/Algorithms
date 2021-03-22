package bakForProblem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i <1000000; i++){
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();


        /*for(int i = 0; i < 1000000; i++){
            System.out.println(i);
        }
*/
    }
}
