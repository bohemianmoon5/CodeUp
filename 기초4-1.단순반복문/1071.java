import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num;
        boolean go = true;
        
        while(go) {
            num = sc.nextInt();
            
            if(num == 0) {
                go = false;
            } else {
                System.out.println(num);
            }
        }
    
	}

}
