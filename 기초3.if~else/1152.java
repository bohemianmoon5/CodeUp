import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if(a < 10) {
            System.out.println("small");
        } else if(a >= 10) {
            System.out.println("big");
        }
        
    }
    
}
