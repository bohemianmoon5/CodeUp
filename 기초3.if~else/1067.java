import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        System.out.printf("%s\n", a > 0 ? "plus" : "minus");
        System.out.printf("%s", a % 2 == 0 ? "even" : "odd");
        
    }
    
}
