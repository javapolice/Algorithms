package bakStringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Location {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char temp = 'a';
        char[] alphabet = new char[26];
        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = temp;
            temp++;
        }
        int[] loc = new int[26];
        for(int i = 0; i < loc.length; i++){
            if(word.indexOf(alphabet[i]) == -1){
                loc[i] = -1;
            }else{
                loc[i] = word.indexOf(alphabet[i]);
            }
        }
        for(int t : loc){
            System.out.print(t+" ");
        }
    }
}
