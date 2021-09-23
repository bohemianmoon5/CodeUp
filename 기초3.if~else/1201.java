import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num == 0) {
            System.out.println(num);
        }else if(num > 0) {
            System.out.println("양수");
        }else {
            System.out.println("음수");
        }
        
    }
    
}
