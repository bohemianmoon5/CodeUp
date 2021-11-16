import java.util.Scanner;

public class Main {

    static int n, k;
    static int[] a;
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    a = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    k = sc.nextInt();
	    System.out.println(f(k));

	}
	static int f(int k) {
	    for(int i = 0; i < n; i++) {
	        if(k == a[i]) {
	            return i+1;
	        }
	    }
	    return -1;
	}

}
