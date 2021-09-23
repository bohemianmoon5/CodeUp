import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        int classNum = sc.nextInt();
        int num = sc.nextInt();
        
        System.out.printf("%d%02d%03d", year, classNum, num);
        
    }
    
}
