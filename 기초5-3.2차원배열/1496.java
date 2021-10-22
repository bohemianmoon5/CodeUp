import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int[] a = new int[1001];
	    
	    for(int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i < n-1; i+=2) {
	        if(a[i] > a[i+1]) {
	            System.out.printf("%d ", a[i+1]);
	        }else {
	            System.out.printf("%d ", a[i]);
	        }
	    }

	}

}
