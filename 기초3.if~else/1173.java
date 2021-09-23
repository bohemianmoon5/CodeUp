import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int rsHour = 0;
        int rsMinute = 0;
        
        if(hour == 0 && minute < 30) {
            rsHour = (hour - 1) + 24;
            rsMinute = (minute - 30) + 60;
        }else if(minute < 30) {
            rsHour = hour - 1;
            rsMinute = (minute - 30) + 60;
        }else {
            rsHour = hour;
            rsMinute = minute - 30;
        }
        System.out.printf("%d %d", rsHour, rsMinute);
    }
    
}
