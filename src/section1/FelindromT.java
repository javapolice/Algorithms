package section1;

import java.util.Scanner;

public class FelindromT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        String result = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) result = "YES";
        return result;
    }


}
