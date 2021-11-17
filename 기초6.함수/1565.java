import java.util.Scanner;

public class Main {
    
    static Long a, b;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    a = sc.nextLong();
	    b = sc.nextLong();
	    if(b > a) {
	        Long temp = b;
	        b = a;
	        a = temp;
	    }
	    System.out.printf("%d", a*b/gcd(a, b));

	}
	static Long gcd(Long a, Long b) {
	    if(a%b == 0) {
	        return b;
	    }
	    return gcd(b, a%b);
	}

}
