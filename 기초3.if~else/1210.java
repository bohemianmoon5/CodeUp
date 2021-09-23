import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int c1 = sc.nextInt();
	    int c2 = sc.nextInt();
	    
	    int[] cal = {0, 400, 340, 170, 100, 70};
	    
	    if((cal[c1] + cal[c2]) > 500) {
	        System.out.println("angry");
	    }else if((cal[c1] + cal[c2]) <= 500) {
	        System.out.println("no angry");
	    }

	}

}
