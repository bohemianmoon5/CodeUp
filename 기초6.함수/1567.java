import java.util.Scanner;

public class Main {
    
    static int n, a, b;
    static int[] d;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    d = new int[n+1];
	    
	    for(int i = 1; i <= n; i++) {
	        d[i] = sc.nextInt();
	    }
	    
	    a = sc.nextInt();
	    b = sc.nextInt();
	    
	    System.out.printf("%d", subsetsum(a, b));

	}
	static Long subsetsum(int a, int b) {
	    Long result = (long) 0;
	    for(int i = a; i <= b; i++) {
	        result += d[i];
	    }
	    return result;
	}

}
