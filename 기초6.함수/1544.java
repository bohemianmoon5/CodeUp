import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    f(n);

	}
	static void f(int n) {
	    for(int i = 0; i < n; i++) {
	        System.out.printf("%c", '*');
	    }
	}

}
