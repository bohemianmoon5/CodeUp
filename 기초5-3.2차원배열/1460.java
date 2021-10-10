import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    boolean flag = true;
	    
	    while(flag) {
	        for(int i = 1; i < n*n+1; i++) {
	            if(i%n == 0) {
	                System.out.printf("%d ", i);
	                System.out.println();
	            }else {
	                System.out.printf("%d ", i);
	            }
	            
	            if(i == n*n) {
	                flag = false;
	            }
	        }
	    }

	}

}
