import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    for(int i = 0; i < n; i++) {
	        if(i == 0) {
	            for(int j = 0; j < n; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }else if(0 < i && i < n-1) {
	            for(int j = 0; j < n; j++) {
	                if(j == 0 || j == i || j == n-i-1 || j == n-1) {
	                    System.out.print("*");
	                }else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }else if(i == n-1) {
	            for(int j = 0; j < n; j++) {
	                System.out.print("*");
	            }
	        }
	    }

	}

}
