import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    System.out.println(f(n));

	}
	static int f(int n) {
	    int result = 1;
	    for(int i = 1; i <= n; i++) {
	        result *= i;
	    }
	    return result;
	}

}
