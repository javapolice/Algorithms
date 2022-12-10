package section1;

import java.util.Scanner;

public class SpecialWordReverseT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        char[] cArray = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while (lt < rt){
            if(!Character.isAlphabetic(cArray[lt])) lt++;
            else if(!Character.isAlphabetic(cArray[rt])) rt--;
            else{
                char tmp = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(cArray);
    }
}
