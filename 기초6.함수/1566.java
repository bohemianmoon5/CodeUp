import java.util.Scanner;

public class Main {
    
    static int a, n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    a = sc.nextInt();
	    n = sc.nextInt();
	    
	    System.out.printf("%d", pow(a, n));

	}
	static Long pow(int a, int n) {
	    Long result = (long) 1;
	    if(a == 1) {
	        result = (long) 1;
	    }else {
	        for(int i = 1; i <= n; i++) {
	            result *= a;
	        }
	    }
	    return result;
	}

}
