import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int temp = k - 2;
	    
	    for(int i = 0; i < n; i++) {
	        if(i == 0) {
	            for(int j = 0; j < n; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }else if(0 < i && i < n-1) {
	            for(int j = 0; j < n; j++) {
	                if(j == 0 || j%k == temp || k == 1 || j == n-1) {
	                    System.out.print("*");
	                }else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	            
	            if(0 < temp && temp <= k-1) {
	                temp--;
	            }else {
	                temp = k - 1;
	            }
	        }else if(i == n-1) {
	            for(int j = 0; j < n; j++) {
	                System.out.print("*");
	            }
	        }
	    }

	}

}
