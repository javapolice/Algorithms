import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int point = scn.nextInt();
        if(point>=90){
            System.out.println("A");
        }else if(point>=80){
            System.out.println("B");
        }else if(point>=70){
            System.out.println("C");
        }else if(point>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
