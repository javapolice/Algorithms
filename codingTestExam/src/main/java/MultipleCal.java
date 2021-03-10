import java.util.Scanner;

public class MultipleCal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        String num3 = String.valueOf(num2);
        int a100 = Integer.parseInt(num3.substring(0,1));
        int a10 = Integer.parseInt(num3.substring(1,2));
        int a = Integer.parseInt(num3.substring(2));

        System.out.println(num1 * a);
        System.out.println(num1 * a10);
        System.out.println(num1 * a100);
        System.out.println(num1 * num2);
    }
}
