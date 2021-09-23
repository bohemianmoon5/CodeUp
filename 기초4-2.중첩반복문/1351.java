import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int f = sc.nextInt();
	    int l = sc.nextInt();
	    
	    for(int i = f; i <= l; i++) {
	        for(int j = 1; j <= 9; j++) {
	             System.out.printf("%d*%d=%d\n", i, j, i*j);
	        }
	    }
	    
	}

}
