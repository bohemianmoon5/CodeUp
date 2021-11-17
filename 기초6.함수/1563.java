import java.util.Scanner;

public class Main {
    
    static int n, m, x;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    m = sc.nextInt();
	    x = sc.nextInt();
	    System.out.printf("%d", f(n, m, x));

	}
	static int f(int n, int m, int x) {
	    return n < m ? (n < x ? (x < m ? x : m) : x) : (m < x ? (x < n ? x : n) : m);
	}

}
