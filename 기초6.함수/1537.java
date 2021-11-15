import java.util.Scanner;

public class Main {
    
    static int n;

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    n = sc.nextInt();
	    f();

	}
	static void f() {
	    if(n == 1) {
	        System.out.println("hello");
	    }else if(n == 2) {
	        System.out.println("world");
	    }
	}

}
