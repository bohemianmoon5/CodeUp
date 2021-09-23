import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        int classNum = sc.nextInt();
        int num = sc.nextInt();
        
        if(num < 10) {
            System.out.printf("%d%d%d%d", year, classNum, 0, num);
        } else {
            System.out.printf("%d%d%d", year, classNum, num);
        }
        
    }
    
}
