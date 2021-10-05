import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int sum = 0;
	    int compare = 0;
	    
	    for(int i = 1; i <= n; i++) {
	        sum += i;
	    }
	    
	    for(int i = 0; i < n-1; i++) {
	        compare += sc.nextInt();
	    }
	    
	    System.out.print(sum - compare);

	}

}
