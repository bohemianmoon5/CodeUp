import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        
        if((age - 1) < 13) {
            System.out.printf("%d %d", 2012 - (age - 1) - 2000, 3);
        }else if((age - 1) > 12) {
            System.out.printf("%d %d", 2012 - (age - 1) - 1900, 1);
        }
        
    }
    
}
