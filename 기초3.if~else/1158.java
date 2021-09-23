import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if(a >= 30 && a <= 40) {
            System.out.println("win");
        } else if(a >= 60 && a <= 70) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
        
    }
    
}
