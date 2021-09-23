import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int value;
	    
	    for(value = 1; value <= n; value++) {
	        if(n%value == 0) {
	            System.out.printf("%d ", value);
	        }
	    }

	}

}
