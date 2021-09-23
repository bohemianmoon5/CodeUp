import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    for(int i = 0; i < m; i++) {
	        if(i == 0 || i == m-1) {
	            for(int j = 0; j < n; j++) {
	                if(j == 0 || j == n-1) {
	                    System.out.print("+");
	                }else {
	                    System.out.print("-");
	                }
	            }
	        }else {
	            for(int j = 0; j < n; j++) {
	                if(j == 0 || j == n-1) {
	                    System.out.print("|");
	                }else {
	                    System.out.print(" ");
	                }
	            }
	        }
	        System.out.println();
	    }

	}

}
