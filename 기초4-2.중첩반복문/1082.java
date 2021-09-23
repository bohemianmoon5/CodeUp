import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int x = sc.nextInt(16);
	    
	    for(int i = 1; i <= 15; i++) {
	        System.out.printf("%X*%X=%X\n", x, i, x*i);
	    }

	}

}
