import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        
        System.out.printf("%s", a >= 50 && a <= 60 ? "win" : "lose");
        
    }
    
}
