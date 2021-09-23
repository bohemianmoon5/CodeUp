import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int l = 0;
	    
	    for(int i = 0; i < n*2 - 1; i++) {
	        if(i < n) {
	            l++;
	        }else {
	            l--;
	        }
	        for(int j = 0; j < l; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	}

}
