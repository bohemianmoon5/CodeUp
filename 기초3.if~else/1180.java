import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int front = (num % 10) * 10;
        int back = num / 10;
        int algorithm = (front + back) * 2;
        
        if(algorithm <= 50) {
            System.out.printf("%d\n%s", algorithm, "GOOD");
        }else if(algorithm > 99){
            if((algorithm - 100) <= 50) {
                System.out.printf("%d\n%s", algorithm - 100, "GOOD");
            }else {
                System.out.printf("%d\n%s", algorithm - 100, "OH MY GOD");
            }
        }else {
            System.out.printf("%d\n%s", algorithm, "OH MY GOD");
        }
        
    }
    
}
