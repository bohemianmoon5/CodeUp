import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    
	    while(true) {
	        if(n < 10) {
	            break;
	        }
	        n = f(n);
	    }
	    
	    System.out.printf("%d", n);

	}
	static int f(int n) {
	    
	    int value = n;
	    int result = 0;
	    
	    while(true) {
	        if(value == 0) {
	            break;
	        }
	        result += value % 10;
	        value /= 10;
	    }
	    
	    return result;
	}

}
