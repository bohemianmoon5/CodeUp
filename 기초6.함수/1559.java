import java.util.Scanner;

public class Main {
    
    static Long n, m;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextLong();
	    m = sc.nextLong();
	    System.out.printf("%d", f(n, m));

	}
	static Long f(Long n, Long m) {
	    return n+m;
	}

}
