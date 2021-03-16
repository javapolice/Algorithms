import java.util.Scanner;

public class AlamTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String time = scn.next();
        int hour = time.split(" ");
        int minute = scn.nextInt();
        if((minute-45) < 0){
            hour=hour-1;
            if(hour < 0){
                hour = 23;
            }
            minute=60 + (minute-45);
        }
        System.out.println(hour);
        System.out.println(minute);
    }
}
