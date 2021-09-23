import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int change = Integer.valueOf(a, 16);
        
        System.out.printf("%o", change);
        
    }
    
}
