import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int h = sc.nextInt();
	    int r = sc.nextInt();
	    
	    for(int i = 0; i < r; i++) {
	        for(int j = 0; j < h; j++) {
	            for(int k = 0; k < j; k++) {
	                System.out.print(" ");
	            }
	            System.out.print("*\n");
	        }
	        for(int j = 0; j < h-1; j++) {
	            for(int k = 0; k < h-j-2; k++) {
	                System.out.print(" ");
	            }
	            System.out.print("*\n");
	        }
	    }

	}

}
