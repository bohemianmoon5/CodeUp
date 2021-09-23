import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if((num % 10) == 1 && !(num == 11)) {
            System.out.printf("%dst", num);
        }else if((num % 10) == 2 && !(num == 12)) {
            System.out.printf("%dnd", num);
        }else if((num % 10) == 3 && !(num == 13)) {
            System.out.printf("%drd", num);
        }else {
            System.out.printf("%dth", num);
        }
        
    }
    
}
