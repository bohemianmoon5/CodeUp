import java.util.Scanner;

public class Main {
    
    static int n, m;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    m = sc.nextInt();
	    System.out.printf("%d", f(n, m));

	}
	static int f(int n, int m) {
	    return n >= m ? n : m;
	}

}
