import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int h = sc.nextInt();
	    int k = sc.nextInt();
	    char d = sc.next().charAt(0);
	    
	    for(int i = 0; i < h; i++) {
	        if(d == 76) {
	            for(int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for(int t = 0; t < k; t++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }else {
	            for(int j = h-i-1; j > 0; j--) {
	                System.out.print(" ");
	            }
	            for(int t = 0; t < k; t++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	}

}
