import java.util.Scanner;

public class Main {
    
    static int a, b;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    a = sc.nextInt();
	    b = sc.nextInt();
	    if(b > a) {
	        int temp = b;
	        b = a;
	        a = temp;
	    }
	    System.out.printf("%d", gcd(a, b));

	}
	static int gcd(int a, int b) {
	    if(a%b == 0) {
	        return b;
	    }
	    return gcd(b, a%b);
	}

}
