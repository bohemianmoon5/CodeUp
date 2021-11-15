import java.util.*;

public class Main {
    
    static int n;
    static int[] a;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    a = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    System.out.println(f());
	    
	}
	static int f() {
	    Arrays.sort(a);
	    return a[0];
	}

}
