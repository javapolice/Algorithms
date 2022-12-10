package bakStringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().toUpperCase().split("");
        char[] alphabet = new char[26];
        int[] alphabetCnt = new int[26];
        char temp = 'A';

        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = temp;
            temp++;
        }

        for(int i = 0; i < word.length; i++){
            for(int j = 0; j < alphabet.length; j++){
                if(word[i].charAt(0) == alphabet[j]){
                    alphabetCnt[j]++;
                }
            }
        }
        int max = -1;
        char maxAlphabet = 0;
        for(int i = 0; i < alphabetCnt.length; i++){
            if(max < alphabetCnt[i]){
                max = alphabetCnt[i];
                maxAlphabet = alphabet[i];
            }
        }
        Arrays.sort(alphabetCnt);
        if (alphabetCnt[25] == alphabetCnt[24]) {
            maxAlphabet = '?';
        }
        System.out.println(maxAlphabet);
    }
}
