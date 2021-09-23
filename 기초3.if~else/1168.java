import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idNum = sc.nextInt();
        int gender = sc.nextInt();
        int result = 0;
        
        if(gender == 1 || gender == 2) {
            result = 2012 - (1900 + (idNum / 10000)) + 1;
        } else if(gender == 3 || gender == 4) {
            result = 2012 - (2000 + (idNum / 10000)) + 1;
        }
        System.out.println(result);
    }
    
}
