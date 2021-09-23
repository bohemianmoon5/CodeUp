import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int BMI = sc.nextInt();
        
        if(BMI <= 10) {
            System.out.println("정상");
        }else if(BMI <= 20 && BMI > 10) {
            System.out.println("과체중");
        }else if(BMI > 20) {
            System.out.println("비만");   
        }
    }
    
}
